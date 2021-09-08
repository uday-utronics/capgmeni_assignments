package exceptionss;

import java.util.Scanner;

public class bank {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		account man = new account(78, 5000);
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter amount to be withdrawn: ");
		double amount = input.nextDouble();
		
		try {
			double k = man.withdraw(amount);
			System.out.println("your remaing balance is "+k);
			
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			//System.out.println("");
			e.printStackTrace();
		} catch (IllegalBankTransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("i am finnaly--- finally");
			
		}
		

	}
}
