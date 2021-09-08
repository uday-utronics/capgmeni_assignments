package oops_concept;

public class singleton{
	public static void main(String[] args) {
		Abc obj1 = Abc.getInstance();
		
		Abc obj2 = Abc.getInstance();
		
		System.out.println(obj1.hashCode()+" and "+obj2.hashCode());
	}

}
class Abc
{
	static Abc obj = new Abc();
	public String s;
	private Abc() {
		s = "hello i am singleton";
	}
	public static Abc getInstance() {
		return obj;
	}
}
