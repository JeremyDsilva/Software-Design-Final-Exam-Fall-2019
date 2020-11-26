package common.observer;

/**
 * Observer Interface
 * Generic Observer defines the Observer in terms of Observer Pattern
 * 
 * @author JeremyDsilva
 *
 * @param <ObservedType> Type to be Observed  
 */
public interface Observer<ObservedType> {
    public void update(Observable<ObservedType> object, ObservedType data);
}
