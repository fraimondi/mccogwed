package cogwedmc.formula.formulareader;

import java.util.*;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

import cogwedmc.formula.formulareader.antlr.*;
import cogwedmc.model.*;


/* Franco 230721
   This is a listener to compute the set of states in which a 
   given formula holds. We use a stack to store intermediate
   results.

*/
public class FormulaEvaluator
    extends CogwedFormulaGrammarBaseListener {
    private CogwedFormulaGrammarParser parser;

    // This is the model where we want to evaluate the formula.
    private CogwedModel cogwedmodel;

    // This is the stack where we store temporary results.
    private Stack<Set<String>> stack;
    

    public FormulaEvaluator (CogwedFormulaGrammarParser p) {
	this.parser = p;
	// In the constructor we create an empty stack.
	stack = new Stack<Set<String>>();
    }

    public void setModel(CogwedModel m) {
	this.cogwedmodel = m;
    }

    // Basic case: an atom
    @Override
    public void exitId(CogwedFormulaGrammarParser.IdContext ctx) {
	// Nothing special, the model gives us the set of states
	stack.push(new HashSet<String>(cogwedmodel.getStatesWhereTrue(ctx.ID().getText())));
    }

    // Negation: we have to take the complement of the set
    @Override
	
    public void exitNegation(CogwedFormulaGrammarParser.NegationContext ctx) {
	Set<String> allStates = new HashSet<String>(this.cogwedmodel.getAllStates().keySet());
	Set<String> previous = stack.pop();

	// removeAll is the set difference
	// TODO: check what happens with empty difference
	allStates.removeAll(previous);
	stack.push(new HashSet<String>(allStates));
    }

        
    // For the conjunction we take the intersection of the two elements on top
    // of the stack
    @Override
    public void exitConjunction(CogwedFormulaGrammarParser.ConjunctionContext ctx) {
	Set<String> left = stack.pop();
	Set<String> right = stack.pop();
	// retainAll is the intersection.
	left.retainAll(right);
	// FIXME: check that everything is OK with an empty intersection
	stack.push(new HashSet<String>(left));
    }

    // This is similar to conjunction above
    @Override
    public void exitDisjunction(CogwedFormulaGrammarParser.DisjunctionContext ctx) {
	Set<String> left = stack.pop();
	Set<String> right = stack.pop();
	// addAll is the union.
	left.addAll(right);
	stack.push(new HashSet<String>(left));
    }

    // (a -> b) is (!a or b)
    @Override
    public void exitImplication(CogwedFormulaGrammarParser.ImplicationContext ctx) {
	// Arguments are swapped on top of stack!
	// (bug fixed)
	Set<String> right = stack.pop();
	Set<String> left = stack.pop();

	// These are all the states
	Set<String> allStates = new HashSet<String>(this.cogwedmodel.getAllStates().keySet());

	// We compute !a:
	allStates.removeAll(left);

	// Now we add b:
	allStates.addAll(right);

	// And we push to stack:
	stack.push(new HashSet<String>(allStates));
    }

    // EX is easy: just the pre-image of all the states in which
    // the formula is true.
    @Override
    public void exitEx(CogwedFormulaGrammarParser.ExContext ctx) {
	Set<String> tmpResult = new HashSet<String>();
	Set<String> previous = stack.pop();

	// We iterate over all states in which the formula is true
	// and we add the predecessors to tmpResult
	for (String aState: previous) {
	    tmpResult.addAll(this.cogwedmodel.getPredecessors(aState));
	}
	stack.push(new HashSet<String>(tmpResult));
    }

    // TODO: implement EG (fix-point etc.)
    // EG is computed using a fix-point, based on the idea that
    // EG p = p and (EX EG p)
    @Override
    public void exitEg(CogwedFormulaGrammarParser.EgContext ctx) {

	Set<String> previous = stack.pop();

	// Two temporary variables
	Set<String> tmp = new HashSet<String>();
	Set<String> q = new HashSet<String>(previous);

	while (!tmp.equals(q)) {
	    tmp = new HashSet<String>(q);
	    Set<String> x = new HashSet<String>(this.cogwedmodel.getPredecessors(tmp));
	    x.retainAll(previous);
	}

	stack.push(new HashSet<String>(q));
    }

    // This is the only complicated operator
    @Override
    public void exitBelief(CogwedFormulaGrammarParser.BeliefContext ctx) {
	// all the states
	// Set<String> allStates = this.cogwedmodel.getAllStates().keySet();	

	// The set of states where the formula is true:
	Set<String> previous = stack.pop();

	float value = Float.parseFloat(ctx.comparisonexpr().comparisonvalue().getText());
	int agentID = Integer.valueOf(ctx.agentid().getText());

	String operator = ctx.comparisonexpr().comparisonoperator().getText();

	Set<String> tmpResult = new HashSet<String>();

	/* IDEA!
	   We don't need to iterate over all states, it is enough
	   to check the ratio of the equiv. class w.r.t. the comparison
	   operator: the truth value is the same for all the states in the
	   equiv. class.
	*/
	for (Set<String> eqClass: this.cogwedmodel.getRK(agentID-1)) {
	    
	    // the set of states of the equivalence class in which the
	    // formula is true: it's just the intersection:
	    Set<String> whereTrue = new HashSet<String>(eqClass);
	    whereTrue.retainAll(previous);

	    float ratio = ((float) whereTrue.size()) / 
		((float) eqClass.size());

	    // Now we have to compare this ratio with the value passed.
	    // We have to go through the possible cases.
	    boolean addSet = false;
	    if (operator.equals("=")) {
		if (ratio == value) {
		    addSet = true;
		}
	    } else if (operator.equals("<")) {
		if (ratio < value) {
		    addSet = true;
		}
	    } else if (operator.equals(">")) {
		if (ratio > value) {
		    addSet = true;
		}
	    } else {
		System.err.println("Unknown operator: "+operator+". Exiting now");
		System.exit(1);
	    }

	    // If the comparison was successful, we add the equiv. class
	    // to the set of states where the formula is true
	    if (addSet) {
		tmpResult.addAll(new HashSet<String>(eqClass));
	    }
	} // end of loop over equivalence classes for agent.

	// Pushing the result to the stack
	stack.push(new HashSet<String>(tmpResult));
    }


    public CogwedModel getModel() {
	return cogwedmodel;
    }

    public Set<String> getSolution() {
	return stack.peek();
    }

}
