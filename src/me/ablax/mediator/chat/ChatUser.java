package me.ablax.mediator.chat;

import me.ablax.mediator.interfaces.MessageMediator;
import me.ablax.mediator.interfaces.User;

/**
 * @author Murad Hamza on 4/19/22
 */
public class ChatUser extends User {

    public ChatUser(final MessageMediator mediator, final String name) {
        super(mediator, name);
        mediator.addUser(this);
    }

    @Override
    public void send(final String message) {
        System.out.println(this.name + " said: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(final String message) {
        System.out.println(this.name + " received: " + message);
    }
}
