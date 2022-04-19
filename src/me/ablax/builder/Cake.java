package me.ablax.builder;

/**
 * @author Murad Hamza on 4/19/22
 */
public class Cake {

    private final double sugar;
    private final double butter;
    private final double milk;
    private final int cocoa;
    private final int vanilla;
    private final int eggs;

    private Cake(final Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.milk = builder.milk;
        this.cocoa = builder.cocoa;
        this.vanilla = builder.vanilla;
        this.eggs = builder.eggs;
    }

    public static class Builder {

        private double sugar;
        private double butter;
        private double milk;
        private int cocoa;
        private int vanilla;
        private int eggs;

        public Builder sugar(final double cups) {
            this.sugar = cups;
            return this;
        }

        public Builder butter(final double packages) {
            this.butter = packages;
            return this;
        }

        public Builder milk(final double cups) {
            this.milk = cups;
            return this;
        }

        public Builder cocoa(final int scoops) {
            this.cocoa = scoops;
            return this;
        }

        public Builder vanilla(final int packages) {
            this.vanilla = packages;
            return this;
        }

        public Builder eggs(final int count) {
            this.eggs = count;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }

    }

}
