// Generated from /Users/jiatianyu/IdeaProjects/Home/sparksqlcore/src/main/scala/com/sparksql/learn/chapter4/antlr/demo/MeSqlParser.g4 by ANTLR 4.9.2
package com.sparksql.learn.chapter4.antlr.demo.gen;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.List;

/**
 * This class provides an empty implementation of {@link MeSqlParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MeSqlParserBaseVisitor extends AbstractParseTreeVisitor<Integer> implements MeSqlParserVisitor<Integer> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	// 循环me节点的所有子节点，调用visitValue函数
	@Override
	public Integer visitMe(MeSqlParser.MeContext ctx) {
		final List<MeSqlParser.ValueContext> value = ctx.value();
		return value.stream().mapToInt(this::visitValue).sum();
	}

	// visitValue函数中判断如果是me节点则调用visitMe，否则返回INT值
	@Override
	public Integer visitValue(MeSqlParser.ValueContext ctx) {
		if (ctx.me() != null) {
			return visitMe(ctx.me());
		}
		if (ctx.INT() != null) {
			return Integer.parseInt(ctx.INT().getText());
		}
		return 0;
	}
}