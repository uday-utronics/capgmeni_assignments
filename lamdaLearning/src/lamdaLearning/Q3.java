package lamdaLearning;

import java.util.function.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntPredicate funp = (value) -> {
			if(value==1)
				return true;
			else
				return false;
		};
		
		boolean a = funp.test(1);
		
		System.out.println(a);
		
	}

}
