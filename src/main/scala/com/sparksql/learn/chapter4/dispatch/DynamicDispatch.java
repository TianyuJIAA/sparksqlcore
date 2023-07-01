package com.sparksql.learn.chapter4.dispatch;


interface Person{
    void method();
}

class Worker implements Person{
    @Override
    public void method() {
        System.out.println("I am as worker");
    }
}
class Teacher implements Person{
    @Override
    public void method() {
        System.out.println("I am teacher!");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Person worker = new Worker();
        Person teacher = new Teacher();
        worker.method();
        teacher.method();
    }
}
