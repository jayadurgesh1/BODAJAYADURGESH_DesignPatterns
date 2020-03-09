package task.com;

import java.util.logging.Logger;

public class Manager implements Employee  { 
	Logger logger = Logger.getLogger(Manager.class.getName());
    private String name; 
    private long empId; 
        private String position; 
  
    public Manager(long empId, String name, String position)  { 
        this.empId = empId; 
        this.name = name; 
                this.position = position; 
    }    
    public void showEmployeeDetails()   { 
        logger.info(empId+" " +name); 
    } 
} 