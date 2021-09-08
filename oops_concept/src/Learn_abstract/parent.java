package Learn_abstract;

/*
 * if any method happens to be abstract inside a class---- class should be abstract as well
 * abstract classes can contain abstract as well as normal methods
 * abstract class cannot be final, private
 *
 * 
 */

public abstract class parent {
	
	
	abstract void m1();
	abstract void m3();
	
	 void m2() {
		 System.out.println("m2 method is in parent and not adstracted");
	 }

}
/*
 * child must give definitions to all abstract methods
 * if not it should be made abstract class
 * abstract class cannot be final, private
 */
abstract class child extends parent{
	 
	 void m1() {
		 System.out.println("i am m1 method and i am in child");
	 }
 }

class both extends child{
	void m3() {
		System.out.println("i am in both");
	}
}
 