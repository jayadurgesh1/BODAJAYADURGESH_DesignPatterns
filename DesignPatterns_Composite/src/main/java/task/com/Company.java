package task.com;

public class Company  { 
    public static void main (String[] args)  { 
    	Programmer prg1 = new Programmer(100, "Dinesh Yadav", "Program Developer"); 
    	Programmer prg2 = new Programmer(101, "Vinay Raghav", "Developer"); 
        CompanyRegister engreg = new CompanyRegister(); 
        engreg.addEmployee(prg1); 
        engreg.addEmployee(prg2); 
          
        Manager man1 = new Manager(200, "Vijay Kumar", "SEO Manager"); 
        Manager man2 = new Manager(201, "Vikram Bhatia ", "Stock Manager"); 
          
        CompanyRegister accreg = new CompanyRegister(); 
        accreg.addEmployee(man1); 
        accreg.addEmployee(man2); 
      
        CompanyRegister reg = new CompanyRegister(); 
        reg.addEmployee(engreg); 
        reg.addEmployee(engreg); 
        reg.showEmployeeDetails(); 
    } 
} 
