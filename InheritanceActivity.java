package Com;

class Employee
{
	long employeeId,employee_Phone;
	String employeeName,employee_Address;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	
Employee(long id,String name,String address,long phone)
{
	this.employeeId = id;
    this.employeeName = name;
    this.employee_Address = address;
    this.employee_Phone = phone;
   
}
void calculateSalary() {
    double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
    System.out.println("Salary: " + salary);
}
public void calculateTransportAllowance() {
    double transportAllowance = 0.10 * basicSalary;
    System.out.println("Transport allowance of " + employeeName + " is: " + transportAllowance);
}
}
class Manager extends Employee {

    Manager(long id, String name, String address, long phone, double salary) {
    	
        super(id, name, address, phone);
        this.basicSalary=salary;
    }
    public void calculateTransportAllowance() {
        double transportAllowance = 0.15 * basicSalary;
        System.out.println("Transport allowance of " + employeeName + " is: " + transportAllowance);
    }
}
class Trainee extends Employee {

    Trainee(long id, String name, String address, long phone, double salary) {
    
        super(id, name, address, phone);
        this.basicSalary=salary;
    }
}

public class InheritanceActivity {
	public static void main(String[] args) {
        Manager manager = new Manager(126534, "Ram", "Maharashtra India", 237844, 75000);
        System.out.println("Manager salary");
        manager.calculateSalary();
       
        manager.calculateTransportAllowance();
        System.out.println();
        
        Trainee t1 = new Trainee(126534, "Raj", "Maharashtra India", 237844, 85000);
        System.out.println("Trainee salary");
        t1.calculateSalary();
      
        t1.calculateTransportAllowance();
    }
}
