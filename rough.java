import java.util.*;

// // // Creating a Base class Employee
// // class Employee{
// // 	String name;
// // 	int basicSalary;

// // 	// Default Constructor
// // 	public Employee(){
// // 		this.name = "Devanshi";
// // 		this.basicSalary = 3000000;
// // 	} 

// // 	// Parametrized Constructor
// // 	public Employee(String name, int basicSalary){
// // 		this.name = name;
// // 		this.basicSalary = basicSalary;
// // 	}

// // 	// Copy Constructor
// // 	public Employee(Employee e){
// // 		this.name = e.name;
// // 		this.basicSalary = e.basicSalary;
// // 	}

// // 	// Getter or Setter Methods
	

// // 	// Printing employee details
// // 	public void printEmployeeDetails(){
// // 		System.out.println();
// // 		System.out.println("Employee name : " + name);
// // 		System.out.println("Basic Salary : " + basicSalary);
// // 	}
// // }
// // // ----------------------------------------------------------------------------------------

// // // Creating a Child class SalesManager
// // class SalesManager extends Employee{
// // 	int salesAmount;

// // 	//Default Constructor
// // 	public SalesManager(){
// // 		this.name = "Srushti";
// // 		this.basicSalary = 100000;
// // 		this.salesAmount = 2000000;
// // 	}

// // 	// Parameterized Constructor
// // 	public SalesManager(String name, int basicSalary , int sa){
// // 		super(name,basicSalary);
// // 		this.salesAmount = sa;
// // 	}

// // 	// Copy Constructor
// // 	public SalesManager(SalesManager sm){
// // 		super(sm);
// // 		this.salesAmount = sm.salesAmount;
// // 	}

// // 	// Overriding the print Employee Deatils method
// // 	@Override
// // 	public void printEmployeeDetails(){
// // 		super.printEmployeeDetails();
// // 		System.out.println("Sales Amount : " + salesAmount);
// // 	}
// // }

// // // -----------------------------------------------------------------------------------------------
// // // Creating a main class Inheritance

// // class rough{
// // 	public static void main(String[] args){
// // 		Employee empDefConstruct = new Employee();
// // 		Employee empParaConstruct = new Employee("Vasu", 50000);
// // 		Employee empCopyConstruct = new Employee(empParaConstruct);
		
// // 		SalesManager smDefConstruct = new SalesManager();
// // 		SalesManager smParaConstruct = new SalesManager("Dev" , 300000,30000);
// // 		SalesManager smCopyConstruct = new SalesManager(smParaConstruct);

// // 		System.out.println("----------- Employee Details -----------");
// // 		empDefConstruct.printEmployeeDetails();
// // 		empParaConstruct.printEmployeeDetails();
// // 		empCopyConstruct.printEmployeeDetails();
// // 		System.out.println("----------------------------------------");
// // 		System.out.println();
// // 		System.out.println("----------Sales Manager Details ----------");
// // 		smDefConstruct.printEmployeeDetails();
// // 		smParaConstruct.printEmployeeDetails();
// // 		smCopyConstruct.printEmployeeDetails();
// // 		System.out.println("------------------------------------------");
// // 	}
// // }

// class A
// { public void sum()
// {
// System.out.println("this is the sum of A");
// }
// }
// class B extends A
// {
// public void sum()
// {
// super.sum(); 
// System.out.println("this is the sum of B");
// } }
// class rough
// { public static void main(String args[])
// { B b1=new B();
// b1.sum();
// } 
// }

// A Simple demonstration of abstract.
class A {
// abstract void callme();
// concrete methods are still allowed in abstract classes
void callmetoo() {
System.out.println("This is a concrete method.");
} }
class B extends A {
void callme() {
System.out.println("B's implementation of callme.");
} }
class rough {
public static void main(String args[]) {
B b = new B();
b.callme();
b.callmetoo();
}}