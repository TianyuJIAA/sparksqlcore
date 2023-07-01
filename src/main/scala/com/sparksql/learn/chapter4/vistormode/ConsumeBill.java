package com.sparksql.learn.chapter4.vistormode;

//消费的单子
public class ConsumeBill implements Bill{

    private final double amount;

    private final String item;

    public ConsumeBill(double amount, String item) {
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
