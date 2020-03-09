package task.com;

public class Radio {
    private boolean on;
    private RadioState state;
    public Radio(RadioState state){
        this.state = state;
    }
    public void execute(){
        state.execute(this);
    }
    public void setState(RadioState state){
        this.state = state;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public boolean isOn(){
        return on;
    }
    public boolean isOff(){
        return !on;
    }
    public static void main(String[] args) {
    	Radio radio = new Radio(new OffRadioState()); 
    	radio.setState(new OnRadioState());
    	radio.execute(); 
    	radio.setState(new OffRadioState());
    	radio.execute(); 
    }
}