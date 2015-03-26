// Generated from /Users/franco/college/mysoft/mccogwed/src/grammars/CogwedFormulaGrammar.g by ANTLR 4.5
package cogwedmc.formula.formulareader.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CogwedFormulaGrammarParser}.
 */
public interface CogwedFormulaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CogwedFormulaGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CogwedFormulaGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Belief}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterBelief(CogwedFormulaGrammarParser.BeliefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Belief}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitBelief(CogwedFormulaGrammarParser.BeliefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eg}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterEg(CogwedFormulaGrammarParser.EgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eg}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitEg(CogwedFormulaGrammarParser.EgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterParens(CogwedFormulaGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitParens(CogwedFormulaGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(CogwedFormulaGrammarParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(CogwedFormulaGrammarParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ex}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterEx(CogwedFormulaGrammarParser.ExContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ex}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitEx(CogwedFormulaGrammarParser.ExContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterNegation(CogwedFormulaGrammarParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitNegation(CogwedFormulaGrammarParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(CogwedFormulaGrammarParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(CogwedFormulaGrammarParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterId(CogwedFormulaGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitId(CogwedFormulaGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Implication}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterImplication(CogwedFormulaGrammarParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Implication}
	 * labeled alternative in {@link CogwedFormulaGrammarParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitImplication(CogwedFormulaGrammarParser.ImplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonexpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonexpr(CogwedFormulaGrammarParser.ComparisonexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonexpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonexpr(CogwedFormulaGrammarParser.ComparisonexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonoperator(CogwedFormulaGrammarParser.ComparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonoperator(CogwedFormulaGrammarParser.ComparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonvalue}.
	 * @param ctx the parse tree
	 */
	void enterComparisonvalue(CogwedFormulaGrammarParser.ComparisonvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#comparisonvalue}.
	 * @param ctx the parse tree
	 */
	void exitComparisonvalue(CogwedFormulaGrammarParser.ComparisonvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CogwedFormulaGrammarParser#agentid}.
	 * @param ctx the parse tree
	 */
	void enterAgentid(CogwedFormulaGrammarParser.AgentidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CogwedFormulaGrammarParser#agentid}.
	 * @param ctx the parse tree
	 */
	void exitAgentid(CogwedFormulaGrammarParser.AgentidContext ctx);
}