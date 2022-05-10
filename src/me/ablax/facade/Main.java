package me.ablax.facade;

import me.ablax.facade.facades.ShapeFacade;

public class Main {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
    }
}
