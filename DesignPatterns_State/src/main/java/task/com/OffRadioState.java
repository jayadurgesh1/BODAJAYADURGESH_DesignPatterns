package task.com;

import java.util.logging.Logger;

public class OffRadioState implements RadioState {
	Logger logger = Logger.getLogger(OffRadioState.class.getName());
    public void execute(Radio radio){
    	logger.info("This method is used to check if Radio is Off");
        radio.setOn(false);
    }
}