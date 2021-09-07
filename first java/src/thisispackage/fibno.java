package thisispackage;

public class fibno {
	public static void fibno(int n)
	{
		int num1=0,num2=1,num3,i;
		System.out.print(num1+" "+num2);
		for(i=2;i<=n;i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=40;
		fibno(count);

	}

}
