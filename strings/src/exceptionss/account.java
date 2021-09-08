package exceptionss;

import java.util.Scanner;

public class account {
	
	long id;
	double balance;
	
	//id = 898;
	//balance = 10000;
	//constructor 
	public account(long id, double balance) {
		this.id = id;
		this.balance =balance;
	}
	
	public double deposit(double k) {
			balance+= k;
			System.out.println("money deposited total balance is "+balance);
			return balance;
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	 public double withdraw(double i) throws InsufficientBalanceException, IllegalBankTransactionException {
		//int balance = 5000;
		if(i>balance) {
			System.out.println("insufficient balance thrown ");
			throw new InsufficientBalanceException();
		}
		else if(i<balance&&i>0){
			System.out.println("withdraw aprooved");
			balance -= i;
			return balance;
		}
		else {
			System.out.println("iilegal thrown");
			throw new IllegalBankTransactionException("illegal");
		}
		
	}


}

