package po;

import common.observer.Observable;
import common.observer.Observer;
import common.state.Context;
import common.state.State;
import noonoo.NooNoo;

public class Po implements Context<Po>, Observer<State<NooNoo>> {

    State<Po> state;
    State<NooNoo> nooNooState;
    
    public Po(){
        state = new SleepingState();
        System.out.println(this + " intial state is " + state);
    }
    
    @Override
    public void setState(State<Po> state) {
        System.out.println(this + " changed to " + state);
        this.state = state;
    }

    @Override
    public State<Po> getState() {
        return state;
    }

    @Override
    public void update(Observable<State<NooNoo>> nooNoo, State<NooNoo> nooNooState) {
        this.nooNooState = nooNooState;
        new Thread(() -> {state.handle(this);}).start();
    }

}
