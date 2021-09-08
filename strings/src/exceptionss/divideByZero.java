package exceptionss;

import java.util.Scanner;

public class divideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1,num2,rem;
		System.out.println("enter numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		try {
			if(num2==0) {
				throw new UnsupportedOperationException("unsupported exception");
			}
			rem = num1/num2;
			System.out.println(num1+" divide by "+num2+" is :"+rem);
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			System.out.println("i am in catch i catched the following exception");
			e.printStackTrace();
		}
		

	}

}
