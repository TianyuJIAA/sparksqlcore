// Generated from /Users/jiatianyu/IdeaProjects/Home/sparksqlcore/src/main/scala/com/sparksql/learn/chapter4/antlr/demo/MeSqlParser.g4 by ANTLR 4.9.2
package com.sparksql.learn.chapter4.antlr.demo;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link MeSqlParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MeSqlParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MeSqlParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMe(MeSqlParser.MeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValue(MeSqlParser.ValueContext ctx) { return visitChildren(ctx); }
}