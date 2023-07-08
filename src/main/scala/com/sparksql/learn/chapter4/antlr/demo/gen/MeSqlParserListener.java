// Generated from /Users/jiatianyu/IdeaProjects/Home/sparksqlcore/src/main/scala/com/sparksql/learn/chapter4/antlr/demo/MeSqlParser.g4 by ANTLR 4.9.2
package com.sparksql.learn.chapter4.antlr.demo.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MeSqlParser}.
 */
public interface MeSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MeSqlParser#me}.
	 * @param ctx the parse tree
	 */
	void enterMe(MeSqlParser.MeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeSqlParser#me}.
	 * @param ctx the parse tree
	 */
	void exitMe(MeSqlParser.MeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MeSqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MeSqlParser.ValueContext ctx);
}