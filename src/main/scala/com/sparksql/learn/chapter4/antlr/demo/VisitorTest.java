package com.sparksql.learn.chapter4.antlr.demo;

import com.sparksql.learn.chapter4.antlr.demo.gen.MeSqlLexer;
import com.sparksql.learn.chapter4.antlr.demo.gen.MeSqlParser;
import com.sparksql.learn.chapter4.antlr.demo.gen.MeSqlParserBaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class VisitorTest {
    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("{1,2,{3,4}");
        //词法解析器，处理input
        MeSqlLexer lexer = new MeSqlLexer(input);
        //词法符号的缓冲器，存储词法分析器生成的词法符号
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //语法分析器，处理词法符号缓冲区的内容
        MeSqlParser parser = new MeSqlParser(tokens);

        // 创建自定义访问器
        MeSqlParserBaseVisitor visitor = new MeSqlParserBaseVisitor();
        // 将parser语法树头节点放入
        Integer sum = visitor.visitMe(parser.me());
        System.out.println(sum);
    }
}
