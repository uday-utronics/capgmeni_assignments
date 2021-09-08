package com.generics.uday;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,Double > map = new HashMap<Integer,Double>();
		map.put(1, 55.78);
		map.put(2, 78.90);
		map.put(3, 776.90);
		System.out.println("iterating hash map");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
