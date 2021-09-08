package oops_concept;


public class Hieararchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labour labour1= new Labour(1, "mahesh", 10000, 1);
		Labour labour2= new Labour(2, "RGV", 12300, 2);
		Manager emp1 = new Manager(1, "dhoni", 250000);
		Manager emp2 = new Manager(1, "kohli", 999000);
		
		System.out.println("name of employee is "+labour1.getName()+" your salary is:"+labour1.getSalary());
		System.out.println("name of employee is "+labour2.getName()+" your salary is:"+labour2.getSalary());
		System.out.println("name of employee is "+emp1.getName()+" your salary is:"+emp1.getSalary());
		System.out.println("name of employee is "+emp2.getName()+" your salary is:"+emp2.getSalary());

	}

}
