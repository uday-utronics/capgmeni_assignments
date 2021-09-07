package thisispackage;

public class zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal sparrow1 = new sparrow(12, "M", 23);
		//sparrow1.move();
		//sparrow1.fly();
		Animal fish1 = new fish(1,"m",2);
		/*Bird bird1 = new Bird(3,"f",10);
		bird1.fly();
		bird1.eat();*/
		moveAnimals(sparrow1);
		
		moveAnimals(fish1);
		
		

	}
	public static void moveAnimals(Animal animal) {
		animal.move();
	}

}
