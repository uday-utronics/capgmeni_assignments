package bank;

public class current extends account{

	double balance;
	double ctotal=10000;
	public current(int actno, String name, double balance) {
		super(actno, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	public double getBalance(){
		return (super.getBalance()+ctotal);
		
	}

	// fixed deposits are present in savings account
}
