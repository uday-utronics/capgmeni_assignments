package lamdaLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("Groot");
		list.add("june");
		list.add("kalluu mama");
		
		list.removeIf(n -> n.length()>5);
		
		Iterator<String> l = list.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		System.out.println("---------------------------------------------------------");
		
		// ***********Question to convert to uppercase*****
		list.replaceAll(String::toUpperCase);
		Iterator<String> k = list.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		
		//***********question 5*******************
		System.out.println("***********question 5*******************");
		
		Consumer<List<String>> displaylist = list1->list1.forEach(System.out::println);
		System.out.println("display list::");
		displaylist.accept(list);
		
		// Know about string builder
		StringBuilder s1 = new StringBuilder();
        Consumer<List<String>> modify = list2->list2.forEach(s ->s1.append(s.charAt(0)));
        modify.accept(list);

        System.out.println("String with first letter of list elements:");
        System.out.println(s1);
        
        // question 7 on hashmap
        System.out.println("-----------------------------------");
        System.out.println("Question 8");
        HashMap<Integer,String> listmap = new HashMap<>();
        
        listmap.put(1, "Utronics");
        listmap.put(2, "samsung electronics");
        listmap.put(3, "toshiba");
        
        Set s = listmap.entrySet();
        
        StringBuilder str = new StringBuilder();
        s.forEach(str1->str.append(str1));
        System.out.println(str);
        

        //---------------for and for each-----------------------------

        System.out.println("----------------------------------------------------");
        System.out.println("practicing for loop of for(din k : list) fashion ");
		for(String kim : list) {
			System.out.println(kim);
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("by using list.forEach where list is object of ArrayList is called lamda for each");
		list.forEach(p->System.out.println(p));
		
		System.out.println("------------------------------------------------------");
		// another way of writing for each it is same as above one
		list.forEach(System.out::println);

	}

}
