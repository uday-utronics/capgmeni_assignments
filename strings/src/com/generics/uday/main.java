package com.generics.uday;

import java.util.HashSet;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class main {

	//private static final String Hashsett = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> sett = new HashSet<Employee>();
		sett.add(new Employee(1, "aakash", "eee", 20000));
		sett.add(new Employee(2, "ironman", "ece", 30000));
		sett.add(new Employee(3, "superman", "super", 40000));
		sett.add(new Employee(4, "antman", "mec", 25000));
		sett.add(new Employee(5, "groot", "civil", 267000));
		sett.add(new Employee(6, "suit", "ece", 20780));
		sett.add(new Employee(7, "stark", "ece", 289500));
		sett.add(new Employee(8, "thanos", "mec", 55600));
		sett.add(new Employee(9, "marvel", "civil", 87800));
		display(sett);
		//sett.iterator();
		//Employee.forEach(System.out::println);
		/*
		 * display();
		 * 
		 * 
		 * Iterator<Employee> it = sett.iterator(); while (it.hasNext()) { Employee emp
		 * = (Employee) it.next();
		 * 
		 * System.out.println(emp); } }
		 */
		//Iterator<Employee> it = sett.iterator();;
        //System.out.println(sett);

		

	}
	public static void display(HashSet<Employee> sett){
	Iterator<Employee> it = sett.iterator();
    while (it.hasNext())
    {
        Employee emp = (Employee) it.next();

        System.out.println(emp);
    }
	}

}
