package com.omar.test.app;

public class MyFirstClass {



    public static void main(String[] args) {
        System.out.println("Hello from Omar's world");

        //instance of Integer type
        Test objInteger = new Test<Integer>(15);
        System.out.println(objInteger.getObj());

        //instance of String type
        Test objString = new Test<String>("yes");
        System.out.println(objString.getObj());

    }
}
