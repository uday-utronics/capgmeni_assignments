package per_6;

public class mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBasePersistance obj = new DataBasePersistance();
		
		obj.persist(90, "hello");
		System.out.println("yoo yo "+obj.getName());
		

	}

}
