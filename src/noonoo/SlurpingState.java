package noonoo;

import common.state.State;

public class SlurpingState implements State<NooNoo> {

    @Override
    public void handle(NooNoo context) {
        context.setState(new SuckingState());
    }

}
