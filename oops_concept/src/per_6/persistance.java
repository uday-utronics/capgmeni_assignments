package per_6;

import java.util.Scanner;

public abstract class persistance {
	
	abstract void persist(int a, String b);

}

class FilePersistance extends persistance{
	int id;
	String name;
	void persist(int id, String name) {
		this.id = id;
		this.name = name;
	}
		/*Scanner input = new Scanner(System.in);
		System.out.println("enter something : ");
		String ctc = input.nextLine();*/	
	
	public String getName() {
		return name;
	}
}
class DataBasePersistance extends persistance{
	int id;
	String name;
	void persist(int id, String name) {
		this.id = id;
		this.name = name;
}
	public String getName() {
		return name;
	}
}