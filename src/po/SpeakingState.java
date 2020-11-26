package po;

import common.state.State;
import noonoo.SlurpingState;

public class SpeakingState implements State<Po> {

    @Override
    public void handle(Po context) {
        if(context.nooNooState.getClass() == SlurpingState.class)
            context.setState(new SleepingState());  
    }

}
