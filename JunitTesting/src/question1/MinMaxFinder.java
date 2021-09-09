package question1;

import java.util.Arrays;

public class MinMaxFinder {

	public static int[] findMinMax(int [] a) throws InvalidException {
		
		if(a.length==0)
		{
			throw new NullPointerException();
		}
		if(a.length==1) {
			throw new InvalidException();
			//System.out.println(a.length);
			
		}
		Arrays.sort(a);
		
		int [] res = new int[2];
		//return({a[0],a[a.length-1]});
		res[0] = a[0];
		res[1] = a[a.length-1];
		return res;
		
		
	}
}
