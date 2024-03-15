package com.max015012.design_patterns.creational.factory_method.electronics;

public class Headphones implements Electronic {
    private static final long TURNING_ON_MILLISECONDS = 500L;

    @Override
    public void turnOn() throws InterruptedException {
        System.out.println("Headphones turning on...");
        Thread.sleep(TURNING_ON_MILLISECONDS);
        System.out.println("Headphones turned on!");
    }
}