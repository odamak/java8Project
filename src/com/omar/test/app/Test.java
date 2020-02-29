package com.omar.test.app;

public class Test <T> {
    T obj;

    //constructor
    Test(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
