package oops_concept;

public class Manager extends Employee {

	int incentive = 100;
	public Manager(int id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}
	//overriding
	public double getSalary() {
		return salary+incentive;
	}

	
	
}
