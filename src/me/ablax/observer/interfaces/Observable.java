package me.ablax.observer.interfaces;

/**
 * @author Murad Hamza on 4/5/22
 */
public interface Observable {

    void subscribe(final Observer observer);

    void unsubscribe(final Observer observer);

    void notifyObservers();

    String getUpdate();

}
