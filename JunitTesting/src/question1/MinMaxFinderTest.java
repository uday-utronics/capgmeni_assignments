package question1;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@BeforeEach
	void beforeAnything() {
		System.out.println("before each @Test");
	}
	@Test
	void test() throws InvalidException {
		//fail("Not yet implemented");
		int [] check = new int[] {98,2,3,4,54};
		int [] arr = MinMaxFinder.findMinMax(check);
		int [] exp = new int[] {2,98};
		assertArrayEquals(exp, arr);		
		System.out.println(arr[0]+" "+arr[1]);	
	}
	@Test
	public void test2(){
		int [] check2 = new int[] {};
		assertThrows(NullPointerException.class, ()->MinMaxFinder.findMinMax(check2));
		
	}
	
	@Test
	public void test3() {
		int [] check3 = new int[] {1};
		assertThrows(InvalidException.class, ()->MinMaxFinder.findMinMax(check3));
		
	}
	

}
