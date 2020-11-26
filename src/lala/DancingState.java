package lala;

import common.state.State;
import noonoo.SuckingState;

public class DancingState implements State<LaLa> {

    @Override
    public void handle(LaLa context) {
        if(context.nooNooState.getClass() == SuckingState.class)
            context.setState(new SingingState());       
    }
    

}
