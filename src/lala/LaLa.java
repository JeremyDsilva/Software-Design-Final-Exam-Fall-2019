package lala;

import common.observer.Observable;
import common.observer.Observer;
import common.state.Context;
import common.state.State;
import noonoo.NooNoo;

public class LaLa implements Context<LaLa>, Observer<State<NooNoo>> {
    
    State<LaLa> state;
    State<NooNoo> nooNooState;
    
    public LaLa(){
        state = new DancingState();
        System.out.println(this + " intial state is " + state);
    }

    @Override
    public void setState(State<LaLa> state) {
        System.out.println(this + " changed to " + state);
        this.state = state;
    }

    @Override
    public State<LaLa> getState() {
        return state;
    }

    @Override
    public void update(Observable<State<NooNoo>> nooNoo, State<NooNoo> nooNooState) {
        this.nooNooState = nooNooState;
        new Thread(() -> {state.handle(this);}).start();
    }

}
