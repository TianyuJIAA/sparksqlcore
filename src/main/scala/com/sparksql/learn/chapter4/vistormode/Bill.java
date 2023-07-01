package com.sparksql.learn.chapter4.vistormode;

//单个单子的接口（相当于Element）
public interface Bill {

    void accept(AccountBookVisitor visitor);

}