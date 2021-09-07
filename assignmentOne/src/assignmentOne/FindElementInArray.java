package assignmentOne;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,12,6,78,19,1,23,26,35,37,7,52,86,47};
		//read input
		System.out.print("please enter a number to search array: ");
		Scanner input = new Scanner(System.in);
		int n,count=0;
		n = input.nextInt();
		//  to search the number in array 
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				count++;
				
			}
			
		}
		// to output if number is present or not
		if(count>0) {
			System.out.println("the number "+n+" is present in array & occured "+count+" times");
		}
		else
		{
			System.out.println("the given number is not present in array");
		}

	}

}
