package util;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    protected List<Observer> observers;

    public Observable(){
        observers= new ArrayList<Observer>();
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }


    public void attach(Observer observer){
        observers.add(observer);
    }

    
    public boolean dettach(Observer observer){
        return observers.remove(observer);
    }
    
}
