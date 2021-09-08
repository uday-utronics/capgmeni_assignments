package DesertShop;

public abstract class DesertItem {

	abstract String currency();
	abstract double getcost();
	abstract double tax();
}
class Candy extends DesertItem{
	 int quantity;
	 
	 int addQuantity(int a) {
		 
		 quantity+=a;
		 return quantity;
	 }
	 String currency() {
		 //euro
		 String s = "dollar";
		 return s;
	 }
	@Override
	double getcost() {
		// TODO Auto-generated method stub
		
		return 10;
	}
	@Override
	double tax() {
		// TODO Auto-generated method stub
		return 0.1*getcost();
	}
}


 class Cookie extends DesertItem{
	 int quantity;
	 
	 int addQuantity(int a) {
		 
		 quantity=quantity+a;
		 return quantity;
	 }
	 
	 String currency() {
		 //dollar
		 String s = "dollar";
		 return s;
	 }

	@Override
	double getcost() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	double tax() {
		// TODO Auto-generated method stub
		return 0.1*getcost();
	}
 }
 class IceCream extends DesertItem{
	 
	 int quantity;
	 
	 int addQuantity(int a) {
		 quantity+=a;
		 return quantity;
	 }
 
	 String currency() {
		 //rupees
		 String s = "rupees";
		 return s;
	 }

	@Override
	double getcost() {
		// TODO Auto-generated method stub
		
		return 100;
	}

	@Override
	double tax() {
		// TODO Auto-generated method stub
		return 0.1*getcost();
	}
 }
 