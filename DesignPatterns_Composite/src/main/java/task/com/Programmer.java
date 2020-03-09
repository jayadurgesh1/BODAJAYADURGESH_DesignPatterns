package task.com;

import java.util.logging.Logger;

public class Programmer implements Employee  { 
	Logger logger = Logger.getLogger(Programmer.class.getName());
	private String name; 
	private long empId; 
	private String position; 

	public Programmer(long empId, String name, String position) 
	{ 
		this.empId = empId; 
		this.name = name; 
				this.position = position; 
	}

	public void showEmployeeDetails() {
		logger.info(empId+" " +name);
		
	} 
	
	
} 
