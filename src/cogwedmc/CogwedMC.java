package cogwedmc;

import java.text.*;
import java.util.*;
import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import cogwedmc.model.*;
import cogwedmc.model.modelreader.*;
import cogwedmc.model.modelreader.antlr.*;

import cogwedmc.formula.*;
import cogwedmc.formula.formulareader.*;
import cogwedmc.formula.formulareader.antlr.*;


/* 
 * Franco 130728: This is the main class to invoke the model checker.
 *
 */

public class CogwedMC {

    // The filename for the model and the formula we want to verify
    private String filename;
    private String formula;
    
    // The model resulting from parsing filename
    private CogwedModel cwmodel;

    public CogwedMC(String filename, String formula) {
	this.filename = filename;
	this.formula = formula;
    }

    public static void main(String[] args) throws Exception {
	if (args.length != 2) {
	    // TODO: we should improve error checking (file exists, etc);
	    System.err.println("You need to provide a model file and a formula.");
	    System.err.println("Example: ");
	    System.out.println("$ java CogwedMC sample.gwm \"B[<.5](1,p1win)\"");
	    System.exit(1);
	}
	
	CogwedMC mc = new CogwedMC(args[0],args[1]);
	mc.start();
    }

    public void start() {

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
	Calendar cal = Calendar.getInstance();
	System.out.println(dateFormat.format(cal.getTime())+": job started");
	// Begin model parsing procedure:
	// create a CharStream that reads from in (either a file or
	// standard input, see above)
	System.out.println("FRANCO: Filename is: "+this.filename);

	try {
	    // TODO: improve exception handling :-)!

	    ANTLRInputStream input = new 
		ANTLRInputStream(new FileInputStream(this.filename));
	    // create a lexer that feeds off of input CharStream
	    CogwedModelGrammarLexer lexer = new CogwedModelGrammarLexer(input);
	    // create a buffer of tokens pulled from the lexer
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    // create a parser that feeds off the tokens buffer
	    CogwedModelGrammarParser parser = new CogwedModelGrammarParser(tokens);
	    // begin parsing at cogwed_model_file rule
	    ParseTree tree = parser.cogwed_model_file(); 
	    // Just a standard walker
	    ParseTreeWalker walker = new ParseTreeWalker();
	    // Now we associate our extractor to the parser.
	    ExtractCogwedModelListener extractor = 
		new ExtractCogwedModelListener(parser);
	    // and we walk the tree with our extractor.
	    walker.walk(extractor, tree);
	    // End of model parsing
	    // We finally get our model:
	    this.cwmodel = extractor.getModel();	
	    cal = Calendar.getInstance();
	    System.out.println(dateFormat.format(cal.getTime())+": model generated");
	    
	    // Creating epistemic relations etc.
	    cwmodel.setupModel();
	    
	    // We begin to parse the formula:
	    ANTLRInputStream finput = new ANTLRInputStream(formula);
	    CogwedFormulaGrammarLexer flexer = new 
		CogwedFormulaGrammarLexer(finput);
	    // create a buffer of tokens pulled from the lexer
	    CommonTokenStream ftokens = new CommonTokenStream(flexer);
	    // create a parser that feeds off the tokens buffer
	    CogwedFormulaGrammarParser fparser = new CogwedFormulaGrammarParser(ftokens);
	    // begin parsing 
	    ParseTree ftree = fparser.start(); 
	    // Just a standard walker
	    ParseTreeWalker fwalker = new ParseTreeWalker();
	    // Now we associate our extractor to the parser.
	    FormulaEvaluator evaluator = new FormulaEvaluator(fparser);
	    evaluator.setModel(cwmodel);
	    // and we walk the tree with our extractor.
	    fwalker.walk(evaluator, ftree);
	    
	    // Et voila, job done
	    Set<String> solution = evaluator.getSolution();	
	    System.out.println("The formula is true in "+ solution.size() + " states");
	    //System.out.println("These are the states: "+evaluator.getSolution());
	    System.out.println("Model size: ");
	    System.out.println("  Number of agents: " + cwmodel.getNumberOfAgents());
	    System.out.println("  Number of states: " + cwmodel.getAllStates().size());
	    System.out.println("  Number of transitions: " + cwmodel.getTemporalRelation().size());
	    cal = Calendar.getInstance();
	    System.out.println(dateFormat.format(cal.getTime())+": job done, see you soon!");
	} catch (Exception e) {
	    System.err.println("Something went wrong...");
	    System.err.println(e.getMessage());
	}
	

    }

}
