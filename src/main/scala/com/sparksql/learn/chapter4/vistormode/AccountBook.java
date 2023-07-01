package com.sparksql.learn.chapter4.vistormode;

import java.util.ArrayList;
import java.util.List;

//账本类（相当于ObjectStruture）
public class AccountBook {
    //单子列表
    private final List<Bill> billList = new ArrayList<>();
    //添加单子
    public void addBill(Bill bill){
        billList.add(bill);
    }
    //供账本的查看者查看账本
    public void accept(AccountBookVisitor visitor){
        for (Bill bill : billList) {
            bill.accept(visitor);
        }
    }
}
