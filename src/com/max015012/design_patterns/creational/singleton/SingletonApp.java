package com.max015012.design_patterns.creational.singleton;

public class SingletonApp implements Runnable {
    private static final Supermarket SUPERMARKET_1 = Supermarket.getInstance(), SUPERMARKET_2 = Supermarket.getInstance();

    @Override
    public void run() {
        System.out.println("\nRunning singleton app...\nReferences equality: " + (SUPERMARKET_1 == SUPERMARKET_2) + "\nStopping singleton app...");
    }
}