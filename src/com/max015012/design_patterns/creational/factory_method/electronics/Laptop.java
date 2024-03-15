package com.max015012.design_patterns.creational.factory_method.electronics;

public class Laptop implements Electronic {
    private static final long TURNING_ON_MILLISECONDS = 1_000L;

    @Override
    public void turnOn() throws InterruptedException {
        System.out.println("Laptop turning on...");
        Thread.sleep(TURNING_ON_MILLISECONDS);
        System.out.println("Laptop turned on!");
    }
}