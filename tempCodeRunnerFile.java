// WAP for payroll management system.Create a class Naming "Employee" having fields eName, basicSalary.provide following functionalities:
// public Employee() // default constructor
// public Employee(String name, int bs) // Overloaded constructor
// public Employee(Employee e) // copy constructor
// Getter/Setter methods
// public void printEmployeeDetails()
// public int getNetIncome() // calculate net salary of an employee
// public static int countEmployees() 
// Derive a class naming "SalesManager" from "Employee" having one more field as salesAmount.

// provide following functionalities :

// public SalesManager() // default constructor
// public SalesManager(String name, int bs, int sa) // overloaded parameterized constructor

// public void printEmployeeDetails() // override method from base class
// public int getNetIncome() // override method from base class

// Test the above mentioned classes by creating appropriate objects.

// Define the base class Employee
class Employee {
    private String eName;       // Employee's name
    private int basicSalary;    // Employee's basic salary

    // Default constructor
    public Employee() {
    }

    // Overloaded constructor
    public Employee(String name, int bs) {
        this.eName = name;
        this.basicSalary = bs;
    }

    // Copy constructor
    public Employee(Employee e) {
        this.eName = e.eName;
        this.basicSalary = e.basicSalary;
    }

    // Getter and Setter methods for fields
    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        this.eName = eName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Print employee details
    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Basic Salary: " + basicSalary);
    }

    // Calculate net income (default implementation)
    public int getNetIncome() {
        return basicSalary;
    }

    // Static method to count employees (placeholder implementation)
    public static int countEmployees() {
        // Implementation to count employees
        return 0;
    }
}

// Define the derived class SalesManager
class SalesManager extends Employee {
    private int salesAmount;    // Sales amount achieved by the Sales Manager

    // Default constructor
    public SalesManager() {
    }

    // Overloaded constructor
    public SalesManager(String name, int bs, int sa) {
        super(name, bs);         // Call base class constructor
        this.salesAmount = sa;
    }

    // Override the printEmployeeDetails method to add sales information
    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();   // Call base class method
        System.out.println("Sales Amount: " + salesAmount);
    }

    // Override the getNetIncome method to calculate net income for Sales Manager
    @Override
    public int getNetIncome() {
        int commission = (int) (salesAmount * 0.1); // Calculate 10% commission
        return getBasicSalary() + commission;
    }
}

// Main class to test the Employee and SalesManager classes
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee("John", 50000);

        // Create a SalesManager object
        SalesManager manager1 = new SalesManager("Alice", 60000, 100000);

        // Print employee details and net income
        emp1.printEmployeeDetails();
        System.out.println("Net Income: " + emp1.getNetIncome());

        System.out.println();

        // Print sales manager details and net income
        manager1.printEmployeeDetails();
        System.out.println("Net Income: " + manager1.getNetIncome());
    }
}
