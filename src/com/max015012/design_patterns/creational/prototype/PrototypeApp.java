package com.max015012.design_patterns.creational.prototype;

import java.util.StringJoiner;

public class PrototypeApp implements Runnable {
    private static final Transport[] TRANSPORTS = {
            new Car("Audi A4"),
            new Ship("Maersk Triple E-Class")
    };

    @Override
    public void run() {
        System.out.println("\nRunning prototype app...");

        StringJoiner equalities = new StringJoiner(", ");

        for (Transport transport : TRANSPORTS) {
            boolean equality = transport.equals(transport.cloneTransport());

            equalities.add(String.valueOf(equality));
        }
        System.out.println("Equalities: " + equalities + "\nStopping prototype app...");
    }
}