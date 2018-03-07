package com.everyday;

public class GarbCollection {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called Object garbage collected : " + this);
    }

    public static void main(String[] args) throws InterruptedException {
        GarbCollection gc1 = new GarbCollection();
        GarbCollection gc2 = new GarbCollection();
        gc1 = null;
        System.gc();
        gc2 = null;
        Runtime.getRuntime().gc();

    }
}