package assignmentOne;
import java.util.Scanner;  
import java.lang.Math;  

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,div,res=0,act,count=0,k;
		//Scanner sc= new Scanner(System.in);
		//System.out.print("enter a numvber: ");
		//num = sc.nextInt();
		for(num=100;num<=1000;num++)
		{
		k = num;
		while(k>0) {
			k = k/10;
			count++;
		}
		act = num;
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			
			res = (int) (res + (Math.pow(rem,count)));
		}
		if(act == res)
		{
			System.out.println(" "+res);
		}
		/*else
		{
			System.out.println("not amstrong");
		}*/
		}

	}

}
