package com.max015012.design_patterns.creational.abstract_factory.factories;

import com.max015012.design_patterns.creational.abstract_factory.cups.Cup;
import com.max015012.design_patterns.creational.abstract_factory.plates.Plate;

public interface DishesFactory {
    Plate createPlate();

    Cup createCup();
}