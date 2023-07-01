package com.sparksql.learn.chapter4.vistormode;

//收入单子
public class IncomeBill implements Bill{

    private final double amount;

    private final String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public void accept(AccountBookVisitor visitor) {
        visitor.visit(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

}
