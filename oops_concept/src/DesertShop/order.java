package DesertShop;

import java.util.Scanner;

public class order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCream owner = new IceCream();
		while(true) {
		int user;
		System.out.println("enter 1 for owner or 0 to order");
		Scanner input = new Scanner(System.in);
		user = input.nextInt();
		
		switch(user) {
		case 0:
			System.out.println("------------please choose order------");
			IceCream butter = new IceCream();
			//butter.getCost
			System.out.println("each ice costs $"+butter.getcost()+" enter number of ice creams: ");
			int ice1;
			ice1 = input.nextInt();
			/*System.out.println("candy no: ");
			int can1;
			can1 = input.nextInt();
			System.out.println("cookies no: ");
			int cok1;
			cok1 = input.nextInt();*/
			
			double total = ice1*butter.getcost();
			System.out.println("total cost of bill is"+total);
			break;
		case 1:
			System.out.println("this is to add items");
			System.out.println("addd icecream; ");
			int press = input.nextInt();
			owner.addQuantity(press);
			System.out.println("quantity of icecreams:"+owner.quantity);
			
		}
		}
	}

}
