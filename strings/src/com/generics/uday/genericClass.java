package com.generics.uday;

import java.util.Arrays;

public class genericClass {
	
	public static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	public static void main(String[] args) {
		Integer [] num = {10,20,89,99,67,88};
		swap(num, 0, 1);
		
		for(Integer db : num) {
			System.out.println(db);
			
		}
		//System.out.println(Arrays.spliterator(num));
	}

}
