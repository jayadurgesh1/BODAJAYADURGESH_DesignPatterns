package task.com;

class BirdSounds implements Pigeon { 
    Birds b; 
    public BirdSounds(Birds bird)  { 
    	this.b = bird; 
    } 
    public void coo()  {  
        b.whichMakeSound(); 
    } 
} 