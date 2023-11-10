package org.example;

public class ObserverImpl implements Observer {

    @Override
    public void update(int newState) {
        System.out.println("Inside Observer : the state changed to " + newState);
    }
}