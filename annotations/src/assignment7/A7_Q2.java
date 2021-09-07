package assignment7;

import java.lang.annotation.*;
public class A7_Q2 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<developer>obj=developer.class;
		Annotation[] annotations = obj.getAnnotations();
		for(Annotation ant:annotations) {
			System.out.println(ant);
		}
	}

}
