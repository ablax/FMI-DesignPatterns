package me.ablax.builder;

/**
 * @author Murad Hamza on 4/19/22
 */
public class Main {

    public static void main(String[] args) {
        final Cake cake = new Cake.Builder()
                .sugar(2)
                .vanilla(10)
                .milk(1.5)
                .build();

        final Cake cocoaCake = new Cake.Builder()
                .milk(2)
                .cocoa(15)
                .sugar(2)
                .eggs(3)
                .build();

    }

}
