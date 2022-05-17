package me.ablax.proxy;

import me.ablax.proxy.entities.RealSound;
import me.ablax.proxy.interfaces.Sound;

public class ProxySound implements Sound {

    private final String fileName;
    private RealSound realSound;

    public ProxySound(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        // if not authorized return;
        (realSound == null ? new RealSound(this.fileName) : realSound).play();
    }
}
