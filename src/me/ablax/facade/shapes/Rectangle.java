package me.ablax.facade.shapes;

import me.ablax.facade.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
