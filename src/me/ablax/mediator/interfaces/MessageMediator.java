package me.ablax.mediator.interfaces;

/**
 * @author Murad Hamza on 4/19/22
 */
public interface MessageMediator {

    void sendMessage(final String message, final User sender);

    void addUser(final User user);

    void removeUser(final User user);

}
