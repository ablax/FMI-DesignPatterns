package me.ablax.commander;

public class Lights {

    private boolean lightsOn;

    public Lights(final boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public void switchOn() {
        this.lightsOn = true;
    }

    public void switchOff() {
        this.lightsOn = false;
    }
}
