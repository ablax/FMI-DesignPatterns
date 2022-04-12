package me.ablax.visitor.productTypes;

import me.ablax.visitor.interfaces.Product;
import me.ablax.visitor.interfaces.ShoppingCartVisitor;

/**
 * @author Murad Hamza on 4/12/22
 */
public class Fruit implements Product {

    private String name;
    private double pricePerKg;
    private double weight;

    public Fruit(final String name, final double pricePerKg, final double weight) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(final double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    @Override
    public double accept(final ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
