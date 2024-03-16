package com.max015012.design_patterns.creational.builder;

public class PizzaBuilder {
    private final PizzaSize pizzaSize;
    private boolean hasPeperoni;
    private boolean hasCheese;

    public PizzaBuilder(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public boolean hasPeperoni() {
        return hasPeperoni;
    }

    public boolean hasCheese() {
        return hasCheese;
    }

    public PizzaBuilder addPeperoni() {
        hasPeperoni = true;
        return this;
    }

    public PizzaBuilder addCheese() {
        hasCheese = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}