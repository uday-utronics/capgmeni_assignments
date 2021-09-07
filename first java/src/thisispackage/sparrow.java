package thisispackage;

public class sparrow extends Bird implements flyable{

	public sparrow(int age, String gender, int weight) {
		super(age, gender, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("i can fly");
		
	}
	

}
