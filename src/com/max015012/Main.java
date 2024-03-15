package com.max015012;

import com.max015012.design_patterns.creational.factory_method.FactoryMethodApp;

import java.util.Arrays;

public class Main {
    private static final Runnable[] RUNNABLE_APPS = {
            new FactoryMethodApp()
    };

    public static void main(String[] args) {
        Arrays.stream(RUNNABLE_APPS).forEach(Runnable::run);
    }
}