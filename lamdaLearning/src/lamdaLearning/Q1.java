package lamdaLearning;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addinf funadd = (a,b)-> a+b;
		addinf fundiv = (a,b) -> a/b;
		addinf funsub = (a,b) -> a-b;
		addinf funmul = (a,b) -> a*b;
		
		int a = funadd.call(8, 8);
		int d = fundiv.call(8, 8);
		int s = funsub.call(8, 8);
		int m = funmul.call(8, 8);
		System.out.println("------------------lambda functions---------------");
		System.out.println("------------------------add-------------------");
		System.out.println(a);
		System.out.println("-----------------------div----------------------");
		System.out.println(d);
		System.out.println("----------------------sub----------------------");
		System.out.println(s);
		System.out.println("------------------mul----------------------");
		System.out.println(m);
		

	}

	
	interface addinf{
		int call(int a, int b);
	}
}
