package me.ablax.visitor;

import me.ablax.visitor.interfaces.ShoppingCartVisitor;
import me.ablax.visitor.productTypes.Book;
import me.ablax.visitor.productTypes.Fruit;

/**
 * @author Murad Hamza on 4/12/22
 */
public class PriceCalculator implements ShoppingCartVisitor {
    @Override
    public double visit(final Fruit fruit) {
        return fruit.getPricePerKg() * fruit.getWeight();
    }

    @Override
    public double visit(final Book book) {
        double price = book.getPrice();
        if (price > 50) {
            price -= 5;
        }
        return price;
    }
}
