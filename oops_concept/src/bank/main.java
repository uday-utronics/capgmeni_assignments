package bank;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating two different objects(accounts) -of current and saving-----
		account nam1 = new current(110, "uday", 78900);
		//current nam2 = new current(111, "Groot", 67900);
		//current nam3 = new current(112, "Ironman", 69900);
		account nam4 = new savings(113, "Superman", 87900, 876);
		//savings nam5 = new savings(114, "Shakthiman", 696900,6543);
		
		
		///invoking getBalance() method on our accounts
		
		double total = nam4.getBalance()+nam1.getBalance();	
		System.out.println("---------------total money in bank is : ---------");
		System.out.println("--------------------"+total+"----------------------");
	}

}
