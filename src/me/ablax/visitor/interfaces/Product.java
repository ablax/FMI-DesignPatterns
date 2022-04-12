package me.ablax.visitor.interfaces;

/**
 * @author Murad Hamza on 4/12/22
 */
public interface Product {

    double accept(final ShoppingCartVisitor visitor);


}
