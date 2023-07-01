package com.sparksql.learn.chapter4.vistormode;

//账单查看者接口（相当于Visitor）
public interface AccountBookVisitor {

    //查看消费的单子
    void visit(ConsumeBill bill);

    //查看收入的单子
    void visit(IncomeBill bill);

}
