package me.ablax.decorator;

import me.ablax.decorator.models.Car;

public abstract class CarDecorator implements Car {

    protected Car decoratedCar;

    public CarDecorator(final Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void create() {
        this.decoratedCar.create();
    }
}
