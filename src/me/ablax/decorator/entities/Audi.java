package me.ablax.decorator.entities;

import me.ablax.decorator.models.Car;

public class Audi implements Car {
    @Override
    public void create() {
        System.out.println("Creating a basic Audi model");
    }
}
