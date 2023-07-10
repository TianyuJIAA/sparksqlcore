package com.sparksql.learn.chapter4.antlr.spark;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.spark.sql.catalyst.parser.SqlBaseLexer;
import org.apache.spark.sql.catalyst.parser.SqlBaseParser;

public class VisitorTest {
    public static void main(String[] args) {
        String query = "SELECT * FROM STUDENT WHERE ID > 10;";
        SqlBaseLexer lexer = new SqlBaseLexer(new ANTLRInputStream(query.toUpperCase()));
        SqlBaseParser parser = new SqlBaseParser(new CommonTokenStream(lexer));

        // 创建自定义访问器
        MySparkVisitor visitor = new MySparkVisitor();
        // 将parser语法树头节点放入
        visitor.visitSingleStatement(parser.singleStatement());
    }
}
