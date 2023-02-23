package lab;

public class Employee {   //main class and super class
void IncrementSalary() {
	System.out.println("Employee block");
}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.IncrementSalary();
		Developer dev=new Developer();
		dev.IncrementSalary();
		Manager man=new Manager();
		man.IncrementSalary();

	}

}
class Developer extends Employee{
	void IncrementSalary() {
		System.out.println("Developer block");
	}
}
class Manager extends Employee{
	void IncrementSalary() {
		System.out.println("Manager block");
	}
}
