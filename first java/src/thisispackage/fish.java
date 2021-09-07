package thisispackage;

public class fish extends Animal {
	
	public fish(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("Swimming....");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("fish is swimming");
	}

}
