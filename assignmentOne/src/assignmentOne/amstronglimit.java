package assignmentOne;

public class amstronglimit {
	
	static void checkamstrong(int num) {
		int rem,div,res=0,act,count=0,k;
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
			System.out.print(" "+res);
		}
		/*else
		{
			System.out.println("not amstrong");
		}*/
		}
	public static void main(String[] args) {
		for(int i=100;i<=10000000;i++) {
			checkamstrong(i);
			}
		}
}
