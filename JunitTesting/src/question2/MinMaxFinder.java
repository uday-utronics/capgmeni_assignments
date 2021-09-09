package question2;

import java.util.Arrays;

public class MinMaxFinder {

	public static minMax findMinMax(int [] a) throws InvalidException {
		
		if(a.length==0)
		{
			throw new NullPointerException();
		}
		if(a.length==1) {
			throw new InvalidException();
			//System.out.println(a.length);
			
		}
		Arrays.sort(a);
		minMax obj = new minMax(a[0],a[a.length-1]);
		return obj;
		
		
		
	}
}


