package po;

import common.state.State;
import noonoo.SuckingState;

public class SleepingState implements State<Po> {

    @Override
    public void handle(Po context) {
        if(context.nooNooState.getClass() == SuckingState.class)
            context.setState(new SpeakingState());  
    }

}
