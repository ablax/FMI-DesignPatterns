package me.ablax.adapter.models;

import me.ablax.adapter.interfaces.MediaPackage;

public class Mp3 implements MediaPackage {
    @Override
    public void playFile(final String fileName) {
        System.out.println("Playing mp3 file " + fileName);
    }
}
