package task.com;

import java.util.logging.Logger;

public class Dog extends Animal {
	Logger logger = Logger.getLogger(Dog.class.getName());
	    public void makeSound(){
	        logger.info("Dogs bark");
	    }
	    public void eatFood(){
	        logger.info("Dogs eat food");
	    }
	    public void sleep(){
	       logger.info("Dogs sleep a lot");
	    }
	    public static void main(String[] args) {
	    	Logger logger = Logger.getLogger(Dog.class.getName());
	    	logger.info("Dog class method's implemented");
	    }
}