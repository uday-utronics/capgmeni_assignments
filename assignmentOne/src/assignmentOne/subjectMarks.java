package assignmentOne;

import java.util.Scanner;

public class subjectMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3;
		
		System.out.println("enter 3 subjectts marks in order");
		try(Scanner input = new Scanner(System.in)){
			sub1=input.nextInt();
			sub2=input.nextInt();
			sub3=input.nextInt();
			if(sub1>60 && sub2>60 && sub3>60) {
				System.out.println("Passed");
			}
			else if((sub1>60 && sub2>60) ||(sub2>60 && sub3>60) ||(sub3>60 && sub1>60)) {
				System.out.println("Promoted");
			}
			else {
				System.out.println("Fail");
			}
		}

	}

}
