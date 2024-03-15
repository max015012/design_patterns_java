package com.max015012.design_patterns.creational.factory_method;

import java.util.Arrays;

public class FactoryMethodApp implements Runnable {
    private static final ElectronicType[] ELECTRONIC_TYPES = ElectronicType.values();

    @Override
    public void run() {
        System.out.println("\nRunning factory method app...");
        Arrays.stream(ELECTRONIC_TYPES)
                .map(ElectronicFactory::createElectronic)
                .forEach(electronic -> {
                    try {
                        electronic.turnOn();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
        System.out.println("Stopping factory method app...");
    }
}