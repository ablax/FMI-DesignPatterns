package me.ablax.mediator;

import me.ablax.mediator.chat.ChatMessageMediator;
import me.ablax.mediator.chat.ChatUser;

/**
 * @author Murad Hamza on 4/19/22
 */
public class Main {
    public static void main(String[] args) {
        final ChatMessageMediator chatroom = new ChatMessageMediator();

        final ChatUser ablax = new ChatUser(chatroom, "Ablax");
        final ChatUser calibri = new ChatUser(chatroom, "Calibri");
        final ChatUser jokeys = new ChatUser(chatroom, "Jokeys");


        ablax.send("Zdravei calibri");
        calibri.send("Zdravei ablax");
    }
}
