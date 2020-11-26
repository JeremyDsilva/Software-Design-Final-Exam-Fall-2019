package lala;

import common.state.State;
import noonoo.SlurpingState;

public class SingingState implements State<LaLa> {

    @Override
    public void handle(LaLa context) {
        if(context.nooNooState.getClass() == SlurpingState.class)
            context.setState(new DancingState());           
    }

}
