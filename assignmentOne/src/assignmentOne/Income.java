package assignmentOne;
import java.util.Scanner;
import java.lang.Math; 

public class Income {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ctc;
		Scanner input = new Scanner(System.in);
		System.out.print("enter ctc: ");
		ctc = input.nextInt();
		if(ctc<180000)
		{
			System.out.println("exmpted from taxation due to ctc ");
		}
		else if(ctc<300000) {
			double tax_amount = ctc*0.1;
			System.out.println("your taxable amount: "+tax_amount);
		}
		else if(ctc<500000) {
			double tax_amount = ctc*0.2;
			System.out.println("your taxable amount: "+tax_amount);
		}
		else if(ctc<1000000) {
			double tax_amount = ctc*0.3;
			System.out.println("your taxable amount: "+tax_amount);
		}
	}

}
