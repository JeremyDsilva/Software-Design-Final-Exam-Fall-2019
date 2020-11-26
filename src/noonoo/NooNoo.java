package noonoo;

import common.observer.Observable;
import common.state.Context;
import common.state.State;

public class NooNoo extends Observable<State<NooNoo>>implements Context<NooNoo>, Runnable {
    
    State<NooNoo> state;
    
    public NooNoo(){
        state = new SlurpingState();
        System.out.println(this + " intial state is " + state);
    }

    @Override
    public void setState(State<NooNoo> state) {
        System.out.println(this + " changed to " + state);
        this.state = state;
        notifyObservers(state);
    }

    @Override
    public State<NooNoo> getState() {
        return state;
    }

    @Override
    public void run() {
        setState(new SlurpingState());      
        while(true) {
            state.handle(this);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

