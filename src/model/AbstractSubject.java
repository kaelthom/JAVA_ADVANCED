package model;

import java.util.ArrayList;
import java.util.List;

public interface AbstractSubject {
    List<AbstractObserver> observers = new ArrayList<>();

    void notifyObservers();

    default void attach(AbstractObserver observer) {
        observers.add(observer);
    }
}
