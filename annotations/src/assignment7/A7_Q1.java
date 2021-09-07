package assignment7;

import java.lang.annotation.ElementType;
//import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

public class A7_Q1 {

	// this is to create a custom annotation
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@interface Test{
		
	}
	
	public static void main(String[] args) {
		printSeries(10);
	}

	@Test
	private static void printSeries(int i) {
		// TODO Auto-generated method stub
		int n=10;
		while(n!=0) {
			System.out.println(n);
			n--;
		}
		
	}
}
