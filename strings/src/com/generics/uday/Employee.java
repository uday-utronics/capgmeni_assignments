package com.generics.uday;

public class Employee {

	int id;
	String name;
	String department;
	double salary;
	
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public int hashCode() {
		return id;
	}
	
    public boolean equals(Object obj)
    {
        Employee employee = (Employee) obj;
 
        return (id == employee.id);
    }
 
    @Override
    public String toString()
    {
        return id+", "+name+", "+department+","+salary ;
    }
}
