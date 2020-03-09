package task.com;

import java.util.logging.Logger;

public class Cat extends Animal {
	Logger logger = Logger.getLogger(Cat.class.getName());
    public void makeSound(){
        logger.info("Cat says meoww...");
    }

    public void eatFood(){
        logger.info("Cat eats food");
    }

    public void sleep(){
        logger.info("Cat sleeps less");
    }
    public static void main(String[] args) {
    	Logger logger = Logger.getLogger(Cat.class.getName());
    	logger.info("Cat class methods implemented");
    }
}