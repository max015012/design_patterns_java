package com.max015012.design_patterns.creational.prototype;

import java.util.Objects;

public class Car implements Transport {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public Transport cloneTransport() {
        return new Car(model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}