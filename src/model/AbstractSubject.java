package model;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {
    List<AbstractObserver> observers = new ArrayList<>();

    public abstract void notifyObservers();

    public void attach(AbstractObserver observer) {
        observers.add(observer);
    }
}
