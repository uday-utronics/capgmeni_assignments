package bank;

public class account {

	int actno;
	String name;
	private double balance;
	
	public account(int actno,String name,double balance) {
		this.actno = actno;
		this.name = name;
		this.balance = balance;
	}
	public int getActno(){
		return actno;	}
	public String getName() {
		return name;
	}
	public double getBalance(){
		return balance;
	}
}
