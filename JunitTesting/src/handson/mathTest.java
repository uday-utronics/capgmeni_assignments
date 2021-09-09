package handson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mathTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		//System.out.println("i am test");
		math math = new math();
		int expected = 1;
		int actual = math.add(5, 5);
		assertEquals(expected,actual,"haha add method ");
	}

}
