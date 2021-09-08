package bank;

public class savings extends account {

	//double balance;
	double FD;
	//double atotal;
	
	public savings(int actno, String name, double balance, double FD) {
		super(actno, name, balance);
		//this.balance = balance;
		this.FD = FD;
		//atotal+= balance+FD;
		// TODO Auto-generated constructor stub
	}
	public double getBalance(){
		return (super.getBalance()+FD);
		
	}

}
