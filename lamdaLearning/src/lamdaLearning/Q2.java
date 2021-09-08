package lamdaLearning;

import lamdaLearning.orders.checking;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		orders o1 = new orders(1, 15500	, "Completed");
		orders o2 = new orders(2, 784300	, "Accepted");
		orders o3 = new orders(3, 9093500	, "cancelled");
		orders o4 = new orders(4, 884700	, "return");
		
		orders o5 = new orders(5, 100	, "Completed");

		checking lamfun = (orders obj) -> {
			if(obj.price>10000&&(obj.status.equalsIgnoreCase("completed")||obj.status.equalsIgnoreCase("accepted")))
				obj.display();
		};
		
	
		lamfun.check(o1);
		lamfun.check(o2);
		lamfun.check(o3);
		lamfun.check(o4);
		lamfun.check(o5);
		
	}

}
