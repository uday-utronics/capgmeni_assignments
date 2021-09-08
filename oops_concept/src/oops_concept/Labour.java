package oops_concept;

public class Labour extends Employee {

	int overtime;
	int amt_overtime = 50;
	
	public Labour(int id, String name, double salary, int overtime) {
		super(id, name, salary);
		this.overtime = overtime;
		// TODO Auto-generated constructor stub
	}
	
	//overriding
	public double getSalary() {
		return salary+(overtime*amt_overtime);
	}

	
	
}
