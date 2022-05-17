package me.ablax.proxy.entities;

import me.ablax.proxy.interfaces.Sound;

public class RealSound implements Sound {

    private final String fileName;

    public RealSound(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing " + fileName);
    }
}
