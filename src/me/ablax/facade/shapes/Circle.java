package me.ablax.facade.shapes;

import me.ablax.facade.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
