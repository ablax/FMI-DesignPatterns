package me.ablax.mediator.chat;

import me.ablax.mediator.interfaces.MessageMediator;
import me.ablax.mediator.interfaces.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Murad Hamza on 4/19/22
 */
public class ChatMessageMediator implements MessageMediator {

    private final List<User> userList;

    public ChatMessageMediator() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(final String message, final User sender) {
        userList.parallelStream().forEach(user -> {
            if (user.equals(sender)) return;
            user.receive(message);

        });
    }

    @Override
    public void addUser(final User user) {
        this.userList.add(user);
    }

    @Override
    public void removeUser(final User user) {
        this.userList.remove(user);
    }
}
