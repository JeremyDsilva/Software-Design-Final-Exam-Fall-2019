package common.state;

/**
 * Context Interface
 * Generic Context Defines based on the state pattern
 * 
 * @author JeremyDsilva
 *
 * @param <C>
 */
public interface Context<C extends Context<C>> {
    
    /**
     * Method to set state of the context
     * 
     * @param state State to be set
     */
    public void setState(State<C> state);
    
    /**
     * Method to get state of the context
     * 
     * @return State<C> Currrent state of the context
     */
    public State<C> getState();
}

