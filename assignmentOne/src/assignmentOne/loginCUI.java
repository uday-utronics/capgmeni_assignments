package assignmentOne;

import java.util.Scanner;

public class loginCUI {
	static boolean loginn() {
		String username = "uday";
		String password = "Groot";
		int atempts =3;
		while(atempts!=0)
		{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String userin = input.nextLine();
		System.out.print("enter password: ");
		String passin = input.nextLine();
		if(username.equals(userin) && password.equals(passin)) {
			return(true);
		}
		else{
			atempts--;
			System.out.println("enter again");
			//return(false);
		}
		}
		if(atempts==0) {
			return(false);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,count =0;
		boolean con = loginn();
		if(con==true) {
			System.out.println("welcome");
		}
		else {
			System.out.println("contact admin: ");
		}
		

	}

}
