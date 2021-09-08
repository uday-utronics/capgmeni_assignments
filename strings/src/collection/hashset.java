package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set1 = new HashSet<>();
		set1.add("iron man");
		set1.add("super man");
		set1.add("ant man");
		// ignores this as it is already there;
		set1.add("iron man");
		set1.add("wonder women");
		
		
		Iterator itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
