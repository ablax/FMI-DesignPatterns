package me.ablax.visitor.productTypes;

import me.ablax.visitor.interfaces.Product;
import me.ablax.visitor.interfaces.ShoppingCartVisitor;

/**
 * @author Murad Hamza on 4/12/22
 */
public class Book implements Product {

    private String title;
    private String isbn;
    private double price;

    public Book(final String title, final String isbn, final double price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public double accept(final ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
