package com.max015012.design_patterns.creational.abstract_factory.factories;

import com.max015012.design_patterns.creational.abstract_factory.cups.Cup;
import com.max015012.design_patterns.creational.abstract_factory.cups.ModernCup;
import com.max015012.design_patterns.creational.abstract_factory.plates.ModernPlate;
import com.max015012.design_patterns.creational.abstract_factory.plates.Plate;

public class ModernDishesFactory implements DishesFactory {
    @Override
    public Plate createPlate() {
        return new ModernPlate();
    }

    @Override
    public Cup createCup() {
        return new ModernCup();
    }
}