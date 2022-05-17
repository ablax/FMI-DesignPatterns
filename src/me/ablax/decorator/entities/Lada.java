package me.ablax.decorator.entities;

import me.ablax.decorator.models.Car;

public class Lada implements Car {
    @Override
    public void create() {
        System.out.println("Creating a basic Lada model.");
    }
}
