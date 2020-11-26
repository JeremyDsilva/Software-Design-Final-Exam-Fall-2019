package common.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Observable Class
 * Generic Observable defines the Subject in terms of Observer Pattern
 * 
 * @author JeremyDsilva
 *
 * @param <ObservedType> Type to be Observed  
 */
abstract public class Observable<ObservedType> {
    
    protected List<Observer<ObservedType>> observers = new LinkedList<Observer<ObservedType>>();

    /**
     * Add Observer to observers 
     * @param obs Observer to added 
     */
    public void addObserver(Observer<ObservedType> obs) {
        if (obs == null) {
            throw new IllegalArgumentException();
        }
        synchronized (observers) {
            if (observers.contains(obs)) {
                return;
            }
            observers.add(obs);
        }
    }

    /**
     * Method to notify observers 
     * @param data Data to be sent to Observers 
     */
    public void notifyObservers(ObservedType data) {
        List<Observer<ObservedType>> toNotify = null;

        synchronized (observers) {
            toNotify = new LinkedList<Observer<ObservedType>>(observers);
        }

        for (Observer<ObservedType> obs : toNotify) {
            obs.update(this, data);
        }
    }

    /**
     * Method to remove observers from list
     * 
     * @param obs
     */
    public void removeObserver(Observer<ObservedType> obs) {
        if (obs == null) {
            throw new IllegalArgumentException();
        }
        
        synchronized (observers) {
            int index = observers.indexOf(obs);
            if (index == -1)
                return;
            observers.remove(index);
        }
    }

}
