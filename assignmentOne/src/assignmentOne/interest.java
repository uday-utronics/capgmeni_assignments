package assignmentOne;
import java.util.Scanner;
import java.lang.Math; 
public class interest {
	static double simpleint(double p,double r,double t) {
		double A;
		A = (p*r*t)/100;
		return(A);
	}
	static double compound(double p,double r,double t,double n) {
		double c;
		c = p*(Math.pow((1+r/100),(t*n)))-p;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle,intrestrate,years;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter principle: ");
		principle = sc.nextDouble();
		//Scanner sc = new Scanner(System.in);
		System.out.println("enter intrest rate: ");
		intrestrate = sc.nextDouble();
		System.out.println("enter number of years");
		years = sc.nextDouble();
		System.out.println("number of times intrest compound");
		double number = sc.nextDouble();
		double simp_val = simpleint(principle,intrestrate,years);
		double comp_val = compound(principle,intrestrate,years,number);
		System.out.println(simp_val);
		System.out.println(comp_val);
		
	}

}
