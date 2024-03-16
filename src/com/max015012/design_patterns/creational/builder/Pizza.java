package com.max015012.design_patterns.creational.builder;

public class Pizza {
    private final PizzaSize pizzaSize;
    private final boolean hasPeperoni;
    private final boolean hasCheese;

    public Pizza(PizzaBuilder pizzaBuilder) {
        pizzaSize = pizzaBuilder.getPizzaSize();
        hasPeperoni = pizzaBuilder.hasPeperoni();
        hasCheese = pizzaBuilder.hasCheese();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize=" + pizzaSize +
                ", hasPeperoni=" + hasPeperoni +
                ", hasCheese=" + hasCheese +
                '}';
    }
}