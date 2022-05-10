package me.ablax.facade.facades;

import me.ablax.facade.interfaces.Shape;
import me.ablax.facade.shapes.Circle;
import me.ablax.facade.shapes.Rectangle;

public class ShapeFacade {

    private final Shape circle;
    private final Shape rectangle;

    public ShapeFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();
    }

}
