package collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import collection.contact2.Gender;

public class runnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contact2 con1 = new contact2(90598, "uday", "buk@gmail.com", Gender.M);
		contact2 con2 = new contact2(859500, "star", "str@gmail.com", Gender.F);
		contact2 con3 = new contact2(98585, "Groot", "groot007@gmail.com", Gender.M);
		contact2 con4 = new contact2(890598, "James bond", "007@mi7.com", Gender.M);
		contact2 con5 = new contact2(87598, "magaret thacher", "maggi@.com", Gender.M);
		
		TreeMap<Long,contact2> map = new TreeMap<Long,contact2>();
		
		map.put((long) 101, con1);
		map.put((long) 102, con2);
		map.put((long) 103, con3);
		map.put((long) 104, con4);
		map.put((long) 105, con5);
		//map.put((long) 102, con2);
		
		//this guy prints heap in values
		System.out.println("All KeyValue pairs----:"+map.keySet()+map.values());
		System.out.println("------------------------------------------------------------------------------");
		map.forEach((key, value) -> System.out.println(key + " " + value));
		System.out.println("------------------------------------------------------------------------------");
        Set<Entry<Long, contact2>> entries = map.entrySet();
        
        //using for loop
        for(Map.Entry<Long, contact2> entry : entries){
            System.out.println( entry.getKey() + "=>" + entry.getValue() );
		
		
		
		

	}

}}
