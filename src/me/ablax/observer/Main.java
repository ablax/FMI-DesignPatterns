package me.ablax.observer;

import me.ablax.observer.impl.Topic;
import me.ablax.observer.impl.TopicSubscriber;

/**
 * @author Murad Hamza on 4/5/22
 */
public class Main {

    public static void main(String[] args) {
        final Topic topic = new Topic();

        final TopicSubscriber obs1 = new TopicSubscriber("Obs1");
        final TopicSubscriber obs2 = new TopicSubscriber("Obs2");
        final TopicSubscriber obs3 = new TopicSubscriber("Obs3");

        topic.subscribe(obs1);
        topic.subscribe(obs2);
        topic.subscribe(obs3);

        topic.setTopic("Hello");

        topic.unsubscribe(obs2);

        topic.setTopic("Bye");
    }

}
