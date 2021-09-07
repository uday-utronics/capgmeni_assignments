package thisispackage;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] populationcountry = new int[5];
		//int[] populationcountry = {100,800,900,1000,890};
		int[] populationcountry = new int[]{100,800,900,1000,890};
		System.out.println("printing before modify");
		for(int i=0;i<populationcountry.length;i++)
		{
			
			System.out.println("pop["+i+"]="+populationcountry[i]);
		}
		populationcountry[0]=100;
		populationcountry[1]=800;
		populationcountry[2]=900;
		populationcountry[3]=1000;
		populationcountry[4]=890;
		System.out.println("printing after modify");
		for(int i=0;i<populationcountry.length;i++)
		{
			
			System.out.println("pop["+i+" ] is "+populationcountry[i]);
		}
		int count = 0;
		for(int elm:populationcountry) {
			count = count+elm;
			System.out.println(elm);
		}
		System.out.println("total population: "+count);
		System.out.println();

	}

}
