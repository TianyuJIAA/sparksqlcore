package com.sparksql.learn.chapter4.dispatch;

public class StaticDispatch {
    public void method(String s){
        System.out.println("输入类型是String");
    }

    public void method(Integer i){
        System.out.println("输入类型是Integer");
    }

    public static void main(String[] args) {
        StaticDispatch dispatch = new StaticDispatch();
        dispatch.method("124");
        dispatch.method(124);
    }
}
