// Generated from /Users/franco/college/tex/articles/13/cogwed/software/cogwed-mc/src/grammars/CogwedFormulaGrammar.g by ANTLR 4.1
package cogwedmc.formula.formulareader.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CogwedFormulaGrammarParser}.
 */
public interface CogwedFormulaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonoperator(@NotNull CogwedFormulaGrammarParser.ComparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonoperator(@NotNull CogwedFormulaGrammarParser.ComparisonoperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonexpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonexpr(@NotNull CogwedFormulaGrammarParser.ComparisonexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonexpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonexpr(@NotNull CogwedFormulaGrammarParser.ComparisonexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonvalue}.
	 * @param ctx the parse tree
	 */
	void enterComparisonvalue(@NotNull CogwedFormulaGrammarParser.ComparisonvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonvalue}.
	 * @param ctx the parse tree
	 */
	void exitComparisonvalue(@NotNull CogwedFormulaGrammarParser.ComparisonvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#Belief}.
	 * @param ctx the parse tree
	 */
	void enterBelief(@NotNull CogwedFormulaGrammarParser.BeliefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#Belief}.
	 * @param ctx the parse tree
	 */
	void exitBelief(@NotNull CogwedFormulaGrammarParser.BeliefContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CogwedFormulaGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CogwedFormulaGrammarParser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#Conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(@NotNull CogwedFormulaGrammarParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#Conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(@NotNull CogwedFormulaGrammarParser.ConjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#agentid}.
	 * @param ctx the parse tree
	 */
	void enterAgentid(@NotNull CogwedFormulaGrammarParser.AgentidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#agentid}.
	 * @param ctx the parse tree
	 */
	void exitAgentid(@NotNull CogwedFormulaGrammarParser.AgentidContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#Ex}.
	 * @param ctx the parse tree
	 */
	void enterEx(@NotNull CogwedFormulaGrammarParser.ExContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#Ex}.
	 * @param ctx the parse tree
	 */
	void exitEx(@NotNull CogwedFormulaGrammarParser.ExContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull CogwedFormulaGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull CogwedFormulaGrammarParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#Disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(@NotNull CogwedFormulaGrammarParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#Disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(@NotNull CogwedFormulaGrammarParser.DisjunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull CogwedFormulaGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull CogwedFormulaGrammarParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#Implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(@NotNull CogwedFormulaGrammarParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#Implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(@NotNull CogwedFormulaGrammarParser.ImplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#Negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(@NotNull CogwedFormulaGrammarParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#Negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(@NotNull CogwedFormulaGrammarParser.NegationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#Eg}.
	 * @param ctx the parse tree
	 */
	void enterEg(@NotNull CogwedFormulaGrammarParser.EgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#Eg}.
	 * @param ctx the parse tree
	 */
	void exitEg(@NotNull CogwedFormulaGrammarParser.EgContext ctx);
}