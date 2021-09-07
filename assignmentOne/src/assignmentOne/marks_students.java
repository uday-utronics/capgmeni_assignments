package assignmentOne;

import java.util.Scanner;

public class marks_students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3,temp1=0,temp2=0,temp3=0;
		Scanner vc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			
			System.out.println("enter your name: ");
			String a = vc.nextLine();
			System.out.println("enter 3 subjectts marks in order");
			sub1=input.nextInt();
			sub2=input.nextInt();
			sub3=input.nextInt();
			int total =sub1+sub2+sub3;
			double avg = total/3;
			System.out.println("hello "+a+" your total is "+total+" and average is"+avg);
			temp1 += sub1;
			temp2 += sub2;
			temp3 += sub3;
			
				
		/*System.out.println("enter 3 subjectts marks in order");
		try(Scanner input = new Scanner(System.in)){
			sub1=input.nextInt();
			sub2=input.nextInt();
			sub3=input.nextInt();
			int total =sub1+sub2+sub3;
			double avg = total/3;
			System.out.println("your total is "+total+" and average is"+avg);
			}*/
		//System.out.println();
		}
		System.out.println(" sub1 total "+temp1+" sub2 total "+temp2+" sub3 total "+temp3);
		System.out.println(" sub1 avg "+temp1/3+" sub2 avg "+temp2/3+" sub3 avg "+temp3/3);
		
	}
}
