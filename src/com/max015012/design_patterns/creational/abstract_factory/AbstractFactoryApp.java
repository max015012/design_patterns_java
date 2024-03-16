package com.max015012.design_patterns.creational.abstract_factory;

import com.max015012.design_patterns.creational.abstract_factory.cups.Cup;
import com.max015012.design_patterns.creational.abstract_factory.factories.ClassicDishesFactory;
import com.max015012.design_patterns.creational.abstract_factory.factories.DishesFactory;
import com.max015012.design_patterns.creational.abstract_factory.factories.ModernDishesFactory;
import com.max015012.design_patterns.creational.abstract_factory.plates.Plate;

import java.util.StringJoiner;

public class AbstractFactoryApp implements Runnable {
    private static final DishesFactory[] DISHES_FACTORIES = {
            new ClassicDishesFactory(),
            new ModernDishesFactory()
    };

    @Override
    public void run() {
        System.out.println("\nRunning abstract factory app...");

        StringJoiner dishesInformation = new StringJoiner("; ");

        for (DishesFactory dishesFactory : DISHES_FACTORIES) {
            Plate plate = dishesFactory.createPlate();
            Cup cup = dishesFactory.createCup();

            dishesInformation.add(plate.getInformation() + ", " + cup.getInformation());
        }
        System.out.println("Dishes: " + dishesInformation + "\nStopping abstract factory app...");
    }
}