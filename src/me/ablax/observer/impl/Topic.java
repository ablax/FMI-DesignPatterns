package me.ablax.observer.impl;

import me.ablax.observer.interfaces.Observable;
import me.ablax.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Murad Hamza on 4/5/22
 */
public class Topic implements Observable {

    private final List<Observer> observerList;
    private String topic;

    public Topic() {
        this.observerList = new ArrayList<>();
    }

    public void setTopic(final String topic) {
        this.topic = topic;
        this.notifyObservers();
    }

    @Override
    public void subscribe(final Observer observer) {
        this.observerList.add(observer);
        observer.setTopic(this);
    }

    @Override
    public void unsubscribe(final Observer observer) {
        this.observerList.remove(observer);
        observer.unSetTopic();
    }

    @Override
    public void notifyObservers() {
        this.observerList.parallelStream().forEach(Observer::update);
    }

    @Override
    public String getUpdate() {
        return topic;
    }
}
