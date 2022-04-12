package me.ablax.visitor;

import me.ablax.visitor.interfaces.Product;
import me.ablax.visitor.interfaces.ShoppingCartVisitor;
import me.ablax.visitor.productTypes.Book;
import me.ablax.visitor.productTypes.Fruit;

/**
 * @author Murad Hamza on 4/12/22
 */
public class Main {
    public static void main(String[] args) {
        final Product book = new Book("The witcher", "23423423", 60);
        final Product banana = new Fruit("Banana", 3.5, 7);

        final ShoppingCartVisitor shoppingCartVisitor = new PriceCalculator();

        final double bookPrice = book.accept(shoppingCartVisitor);
        final double bananaPrice = banana.accept(shoppingCartVisitor);
        System.out.printf("Book price: %s%n", bookPrice);
        System.out.printf("Banana price: %s%n", bananaPrice);

    }
}
