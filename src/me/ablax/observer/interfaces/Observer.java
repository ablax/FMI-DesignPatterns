package me.ablax.observer.interfaces;

/**
 * @author Murad Hamza on 4/5/22
 */
public interface Observer {

    void update();

    void setTopic(final Observable topic);

    default void unSetTopic() {
        setTopic(null);
    }

}
