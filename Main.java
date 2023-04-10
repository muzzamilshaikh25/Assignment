class Employee {
    long employeeId, employee_Phone;
    String employeeName, employee_Address;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    Employee(long id, String name, String address, long phone) {
        this.employeeId = id;
        this.employeeName = name;
        this.employee_Address = address;
        this.employee_Phone = phone;
    }

    void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println("Salary of " + employeeName + " is: Rs" + salary);
    }
}

class Manager extends Employee {
    Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }
}

class Trainee extends Employee {
    Trainee(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        m.calculateSalary();

        Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        t.calculateSalary();
    }
}