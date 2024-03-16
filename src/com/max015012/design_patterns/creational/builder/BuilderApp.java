package com.max015012.design_patterns.creational.builder;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BuilderApp implements Runnable {
    private static final Pizza[] PIZZAS = {
            new PizzaBuilder(PizzaSize.SMALL).addPeperoni().build(),
            new PizzaBuilder(PizzaSize.LARGE).addPeperoni().addCheese().build()
    };

    @Override
    public void run() {
        System.out.println("\nRunning builder app...");

        String pizzasInformation = Arrays.stream(PIZZAS)
                .map(Pizza::toString)
                .collect(Collectors.joining(",\n"));

        System.out.println("Pizzas:\n" + pizzasInformation + "\nStopping builder app...");
    }
}