package me.ablax.decorator.decorators;

import me.ablax.decorator.CarDecorator;
import me.ablax.decorator.models.Car;

public class BlueCarDecorator extends CarDecorator {

    public BlueCarDecorator(final Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void create() {
        setBlueColor();
        super.create();
    }

    private void setBlueColor() {
        System.out.println("Car color set to blue");
    }
}
