package thisispackage;

public class Bird extends Animal{
	
	public Bird(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Flapping my wings..");
		
	}

	/*public void fly() {
		System.out.println("Flying......");
	}*/

}
