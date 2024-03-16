package com.max015012.design_patterns.creational.singleton;

public class Supermarket {
    private static volatile Supermarket instance;

    private Supermarket() {
    }

    public static Supermarket getInstance() {
        if (instance == null) {
            synchronized (Supermarket.class) {
                if (instance == null) {
                    instance = new Supermarket();
                }
            }
        }
        return instance;
    }
}