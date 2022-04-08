package com.company;

public class Car implements AutoCloseable {


    @Override
    public void close() throws Exception {
        System.out.println("Jabylyp jatat");
    }
    public  void drive() throws Exception{
        System.out.println("Mashina jurup jatat");
    }
}



