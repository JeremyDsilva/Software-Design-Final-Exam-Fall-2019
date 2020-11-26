package noonoo;

import common.state.State;

public class SuckingState implements State<NooNoo> {

    @Override
    public void handle(NooNoo context) {
        context.setState(new SlurpingState());
    }

}
