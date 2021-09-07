package thisispackage;


// using class we are actually describing the object
// if you want anything to belong to class make it static!!
class Product{
	
	//Attributes
	//private int pid;
	int pid;
	String name;
	int price;
	
	
	
	// Constructor
	Product(){
		System.out.println(">> Product object constructed");
	}
	//methods(behaviour)
	// to write data in product object we have this method
	void setProductDetails(int pid, String name, int price) {
		this.pid =pid;
		this.name =name;
		this.price = price;
		System.out.println(">> Data written in Product Object");
	}
	// to read data from object
	void showProductDetails() {
		System.out.println("-------product ID: "+pid+"------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("---------------------------------");
	}
	//setter
	void setPid(int pid) {
		this.pid = pid;// this means reference to current object
		//LHS belongd to object and RHS belongs to method
	}
	
	//getter
	int getPid() {
		return pid;
	}
}

class Mobile extends Product{// IS-A a relation mobile is a child, product is parent
	// additional Attributes of mobile other than the product
	String os;
	int ram;
	int sdCardSize;
	
	Mobile(){
		System.out.println(">> Mobile Object constructed ");
		
	}
	
	// redefined same method from parent parent to child with different inputs
	//we have 2 methods in child, 1 from Parent and 1 from Child
	//both are different based on inputs(even though name is same)
	//Method overloading: same methos name with different inputs
	void setProductDetails(int pid, String name, int price,String os, int ram, int sdCardSize) {
		this.pid =pid;
		this.name =name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdCardSize = sdCardSize;
		System.out.println(">> Data written in Mobile Object");
	}
	
	//redefine showProductDetails
	//with same inputs
	//2 methods , 1 from parent and 1 from child and we have same signatures
	// child method will be executed and not parent method
	
	// METHOD OVERRIDING :Same method Name with same Inputs in Parent Child Relationship
	void showProductDetails() {
		System.out.println("-------product ID: "+pid+"------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("os:\t"+os);
		System.out.println("Ram:\t"+ram);
		System.out.println("Sdcard:\t"+sdCardSize);
		
		System.out.println("---------------------------------");
	}

}

public class OOPS_concepts {
	
	
	//main is executed by JVM!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// create product object : product
		Product mobile = new Product();
		
		//System.out.println("product is:"+product);
		
		mobile.setProductDetails(101,"i phoone",80000);
		//reading  dat from object
		mobile.showProductDetails();
		System.out.println();
		
		// lets write data directly
		Product product2 = new Product();
		//product2.pid = 201 ; is an error since attribute marked as 
		// private cannot be accessed!!
		product2.setPid(201);
		product2.name = "table fan";
		product2.price = 9000;
		product2.showProductDetails();
		*/
		Mobile mobile = new Mobile();
		// Product object constructed before Mobile Object
		//-->Rule to Inheritance (Object to Object)
		
		//mobile.setProductDetails(301, "iPhone X", 2000);
		//mobile.showProductDetails();
		
		mobile.setProductDetails(301, "iphone", 200000, "i OS", 4, 128);
		mobile.showProductDetails();
	}

}
