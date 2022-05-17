package me.ablax.adapter;

import me.ablax.adapter.interfaces.MediaPackage;
import me.ablax.adapter.interfaces.MediaPlayer;

public class FormatAdapter implements MediaPlayer {

    private final MediaPackage mediaPackage;

    public FormatAdapter(final MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(final String fileName) {
        mediaPackage.playFile(fileName);
    }
}
