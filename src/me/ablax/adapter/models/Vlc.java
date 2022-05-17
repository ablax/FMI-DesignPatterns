package me.ablax.adapter.models;

import me.ablax.adapter.interfaces.MediaPlayer;

public class Vlc implements MediaPlayer {
    @Override
    public void play(final String fileName) {
        System.out.println("Playing media file: " + fileName);
    }
}
