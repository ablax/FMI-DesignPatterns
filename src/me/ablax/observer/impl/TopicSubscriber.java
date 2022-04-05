package me.ablax.observer.impl;

import me.ablax.observer.interfaces.Observable;
import me.ablax.observer.interfaces.Observer;

/**
 * @author Murad Hamza on 4/5/22
 */
public class TopicSubscriber implements Observer {

    private final String name;
    private Observable topic;

    public TopicSubscriber(final String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if(this.topic == null){
            System.out.println(this.name + " has no topic");
            return;
        }
        System.out.println(this.name + " changed to " + this.topic.getUpdate());
    }

    public String getName() {
        return name;
    }

    @Override
    public void setTopic(final Observable topic) {
        this.topic = topic;
    }
}
