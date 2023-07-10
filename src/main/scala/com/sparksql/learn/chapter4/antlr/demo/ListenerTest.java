package com.sparksql.learn.chapter4.antlr.demo;

import com.sparksql.learn.chapter4.antlr.demo.gen.MeSqlLexer;
import com.sparksql.learn.chapter4.antlr.demo.gen.MeSqlParser;
import com.sparksql.learn.chapter4.antlr.demo.gen.MeSqlParserBaseListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ListenerTest {
    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("{1,2,{3,4}");
        //词法解析器，处理input
        MeSqlLexer lexer = new MeSqlLexer(input);
        //词法符号的缓冲器，存储词法分析器生成的词法符号
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //语法分析器，处理词法符号缓冲区的内容
        MeSqlParser parser = new MeSqlParser(tokens);

        ParseTree tree = parser.me();
        // ParseTreeWalker类将实现的MeSqlParserBaseListener监听器放入
        new ParseTreeWalker().walk(new MeSqlParserBaseListener(), tree);
    }
}
