package cogwedmc.model.modelreader;

import java.util.*;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

import cogwedmc.model.*;
import cogwedmc.model.modelreader.antlr.*;

/* Franco 130721
   A Listener to generate a CogwedModel object from the parse tree.
   This is the only complicated part. There is a walker traversing
   the parse tree and we need to listen to the various events 
   (entering/exiting rules).

*/
public class ExtractCogwedModelListener 
    extends CogwedModelGrammarBaseListener {
    private CogwedModelGrammarParser parser;

    // This is the model we want to build.
    private CogwedModel cogwedmodel;
    

    // Some variables to store temporary values.    
    // the id of the current global state
    private String curGStateID;
    // A list of local states;
    private List<String> curLStateList = new ArrayList<String>();
    // the id of the current atom
    private String curAtom;
    // A list of global states
    private Set<String> curGStateList = new HashSet<String>();


    
    public ExtractCogwedModelListener (CogwedModelGrammarParser p) {
	this.parser = p;
	// In the constructor we create an empty model.
	cogwedmodel = new CogwedModel();
    }
    
    // Just setting the number of agents: this is easy, when the parser enter
    // the nofagents rule, we get them (the way to do this is a bit complicated,
    // we need to get the context and then extract the value from this, but the
    // idea is simple).
    @Override
    public void enterNofagents (CogwedModelGrammarParser.NofagentsContext ctx) {
	cogwedmodel.setNumberOfAgents(Integer.parseInt(ctx.NONZEROINT().getText()));
    }


    // This is to store global states.
    // Entering the definition of a global state
    @Override
    public void enterStatedef(CogwedModelGrammarParser.StatedefContext ctx) {
	curGStateID = ctx.ID().getText();
	curLStateList.clear();
    }

    // Entering the definition of a list of local states
    @Override
    public void enterLstateslist(CogwedModelGrammarParser.LstateslistContext ctx) {
	for (TerminalNode id: ctx.ID()) {
	    curLStateList.add(id.getText());
	}
    }

    // Exiting the definition of a global state
    @Override
    public void exitStatedef(CogwedModelGrammarParser.StatedefContext ctx) {
	cogwedmodel.addGlobalState(new String(curGStateID),new ArrayList<String>(curLStateList));
    }
    // All done with global states
    
    
    // Temporal relation: this is a bit easier, we just add SingleTransition
    // to rt. The relevant rule is pairofstates
    @Override
    public void enterPairofstates(CogwedModelGrammarParser.PairofstatesContext ctx) {
	cogwedmodel.addTransition(new SingleTransition(ctx.ID().get(0).getText(),
						       ctx.ID().get(1).getText()));
    }


    // Finally, we need to get the list of atoms. This is similar to the list of local states above.
    // The relevant rules are: atoms, singledef, and gstateslist.

    @Override
    public void enterSingledef(CogwedModelGrammarParser.SingledefContext ctx) {
	curAtom = ctx.ID().getText();
	curGStateList.clear();
    }

    @Override
    public void enterGstateslist(CogwedModelGrammarParser.GstateslistContext ctx) {
	for (TerminalNode id: ctx.ID()) {
	    curGStateList.add(id.getText());
	}
    }

    @Override
    public void exitSingledef(CogwedModelGrammarParser.SingledefContext ctx) {
	cogwedmodel.addAtom(new String(curAtom), new HashSet<String>(curGStateList));
    }

    // A simple getter to retrieve the model.
    public CogwedModel getModel() {
	return cogwedmodel;
    }

}
