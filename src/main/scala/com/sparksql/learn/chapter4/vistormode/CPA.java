package com.sparksql.learn.chapter4.vistormode;

//注册会计师类，查看账本的类之一
public class CPA implements AccountBookVisitor{

    //注会在看账本时，如果是支出，则如果支出是工资，则需要看应该交的税交了没
    public void visit(ConsumeBill bill) {
        if (bill.getItem().equals("工资")) {
            System.out.println("注会查看工资是否交个人所得税。");
        }
    }
    //如果是收入，则所有的收入都要交税
    public void visit(IncomeBill bill) {
        System.out.println("注会查看收入交税了没。");
    }

}
