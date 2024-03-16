package com.max015012.design_patterns.creational.prototype;

import java.util.Objects;

public class Ship implements Transport {
    private final String model;

    public Ship(String model) {
        this.model = model;
    }

    @Override
    public Transport cloneTransport() {
        return new Ship(model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Objects.equals(model, ship.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}