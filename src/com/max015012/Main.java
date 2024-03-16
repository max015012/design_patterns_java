package com.max015012;

import com.max015012.design_patterns.creational.abstract_factory.AbstractFactoryApp;
import com.max015012.design_patterns.creational.builder.BuilderApp;
import com.max015012.design_patterns.creational.factory_method.FactoryMethodApp;
import com.max015012.design_patterns.creational.prototype.PrototypeApp;
import com.max015012.design_patterns.creational.singleton.SingletonApp;

import java.util.Arrays;

public class Main {
    private static final Runnable[] RUNNABLE_APPS = {
            new FactoryMethodApp(),
            new AbstractFactoryApp(),
            new BuilderApp(),
            new PrototypeApp(),
            new SingletonApp()
    };

    public static void main(String[] args) {
        Arrays.stream(RUNNABLE_APPS).forEach(Runnable::run);
    }
}