// Generated from /Users/franco/college/tex/articles/13/cogwed/software/cogwed-mc/src/grammars/CogwedModelGrammar.g by ANTLR 4.1
package cogwedmc.model.modelreader.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CogwedModelGrammarParser}.
 */
public interface CogwedModelGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#pairofstates}.
	 * @param ctx the parse tree
	 */
	void enterPairofstates(@NotNull CogwedModelGrammarParser.PairofstatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#pairofstates}.
	 * @param ctx the parse tree
	 */
	void exitPairofstates(@NotNull CogwedModelGrammarParser.PairofstatesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#atomsdef}.
	 * @param ctx the parse tree
	 */
	void enterAtomsdef(@NotNull CogwedModelGrammarParser.AtomsdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#atomsdef}.
	 * @param ctx the parse tree
	 */
	void exitAtomsdef(@NotNull CogwedModelGrammarParser.AtomsdefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#statedef}.
	 * @param ctx the parse tree
	 */
	void enterStatedef(@NotNull CogwedModelGrammarParser.StatedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#statedef}.
	 * @param ctx the parse tree
	 */
	void exitStatedef(@NotNull CogwedModelGrammarParser.StatedefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#cogwed_model_file}.
	 * @param ctx the parse tree
	 */
	void enterCogwed_model_file(@NotNull CogwedModelGrammarParser.Cogwed_model_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#cogwed_model_file}.
	 * @param ctx the parse tree
	 */
	void exitCogwed_model_file(@NotNull CogwedModelGrammarParser.Cogwed_model_fileContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#gstateslist}.
	 * @param ctx the parse tree
	 */
	void enterGstateslist(@NotNull CogwedModelGrammarParser.GstateslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#gstateslist}.
	 * @param ctx the parse tree
	 */
	void exitGstateslist(@NotNull CogwedModelGrammarParser.GstateslistContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#tempreldef}.
	 * @param ctx the parse tree
	 */
	void enterTempreldef(@NotNull CogwedModelGrammarParser.TempreldefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#tempreldef}.
	 * @param ctx the parse tree
	 */
	void exitTempreldef(@NotNull CogwedModelGrammarParser.TempreldefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#statesdef}.
	 * @param ctx the parse tree
	 */
	void enterStatesdef(@NotNull CogwedModelGrammarParser.StatesdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#statesdef}.
	 * @param ctx the parse tree
	 */
	void exitStatesdef(@NotNull CogwedModelGrammarParser.StatesdefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#singledef}.
	 * @param ctx the parse tree
	 */
	void enterSingledef(@NotNull CogwedModelGrammarParser.SingledefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#singledef}.
	 * @param ctx the parse tree
	 */
	void exitSingledef(@NotNull CogwedModelGrammarParser.SingledefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#lstateslist}.
	 * @param ctx the parse tree
	 */
	void enterLstateslist(@NotNull CogwedModelGrammarParser.LstateslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#lstateslist}.
	 * @param ctx the parse tree
	 */
	void exitLstateslist(@NotNull CogwedModelGrammarParser.LstateslistContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedModelGrammarParser#nofagents}.
	 * @param ctx the parse tree
	 */
	void enterNofagents(@NotNull CogwedModelGrammarParser.NofagentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedModelGrammarParser#nofagents}.
	 * @param ctx the parse tree
	 */
	void exitNofagents(@NotNull CogwedModelGrammarParser.NofagentsContext ctx);
}