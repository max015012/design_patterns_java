package com.max015012.design_patterns.creational.factory_method;

import com.max015012.design_patterns.creational.factory_method.electronics.Electronic;
import com.max015012.design_patterns.creational.factory_method.electronics.Headphones;
import com.max015012.design_patterns.creational.factory_method.electronics.Laptop;

public class ElectronicFactory {
    public static Electronic createElectronic(ElectronicType electronicType) {
        return switch (electronicType) {
            case LAPTOP -> new Laptop();
            case HEADPHONES -> new Headphones();
        };
    }
}