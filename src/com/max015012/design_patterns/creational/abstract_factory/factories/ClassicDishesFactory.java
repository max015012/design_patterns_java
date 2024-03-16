package com.max015012.design_patterns.creational.abstract_factory.factories;

import com.max015012.design_patterns.creational.abstract_factory.cups.ClassicCup;
import com.max015012.design_patterns.creational.abstract_factory.cups.Cup;
import com.max015012.design_patterns.creational.abstract_factory.plates.ClassicPlate;
import com.max015012.design_patterns.creational.abstract_factory.plates.Plate;

public class ClassicDishesFactory implements DishesFactory {
    @Override
    public Plate createPlate() {
        return new ClassicPlate();
    }

    @Override
    public Cup createCup() {
        return new ClassicCup();
    }
}