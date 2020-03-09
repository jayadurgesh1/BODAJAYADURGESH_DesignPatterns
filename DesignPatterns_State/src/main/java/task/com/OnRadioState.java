package task.com;

import java.util.logging.Logger;

public class OnRadioState implements RadioState {
	Logger logger = Logger.getLogger(OnRadioState.class.getName());
    public void execute(Radio radio){
    	logger.info("This method is used to check if Radio is On");
        radio.setOn(true);
    }
}