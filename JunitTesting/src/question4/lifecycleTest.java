package question4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class lifecycleTest {

	@BeforeAll
	static void beforeall() {
		System.out.println("this is printed first::::::::::: @BeforeAll::::::::");
	}
	
	@AfterAll
	static void afteralll() {
		System.out.println("prints after every test case");
	}
	
	
	@Before
	void before() {
		System.out.println("this runs before every test case @Test");
	}
	
	@Ignore
	void itignores() {
		System.out.println("this doesn't print as it is ignored");
	}
	
	@Test
	void test() {
		//fail("Not yet implemented");
		System.out.println("test 1:::::");
	}
	
	@Test
	void test1() {
		lifecycle obj = new lifecycle();
		int a = obj.add(10, 20);
		assertEquals(30,a);
				
	}

}
