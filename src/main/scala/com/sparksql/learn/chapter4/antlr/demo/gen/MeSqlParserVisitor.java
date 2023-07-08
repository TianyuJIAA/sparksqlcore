// Generated from /Users/jiatianyu/IdeaProjects/Home/sparksqlcore/src/main/scala/com/sparksql/learn/chapter4/antlr/demo/MeSqlParser.g4 by ANTLR 4.9.2
package com.sparksql.learn.chapter4.antlr.demo.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MeSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MeSqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MeSqlParser#me}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMe(MeSqlParser.MeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MeSqlParser.ValueContext ctx);
}