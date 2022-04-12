package me.ablax.visitor.interfaces;

import me.ablax.visitor.productTypes.Book;
import me.ablax.visitor.productTypes.Fruit;

/**
 * @author Murad Hamza on 4/12/22
 */
public interface ShoppingCartVisitor {

    double visit(final Fruit fruit);

    double visit(final Book book);


}
