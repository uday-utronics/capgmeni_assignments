package collection;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Date d1 = new Date();
		//Date d1 = new Date(1200,9,2);
		LocalDate d = LocalDate.of(2000, 1, 2);
		LocalDate d1 = LocalDate.of(2000, 1, 2);
		LocalDate d2 = LocalDate.of(2000, 1, 2);
		LocalDate d3 = LocalDate.of(2000, 1, 2);
		LocalDate d4 = LocalDate.of(2000, 1, 2);
		LocalDate d5 = LocalDate.of(2000, 1, 2);
		LocalDate d6 = LocalDate.of(2000, 1, 2);
		LocalDate d7 = LocalDate.of(2000, 1, 2);

		
		
		LinkedList<LocalDate> birthday = new LinkedList<LocalDate>();
		/*
		 * birthday.add(d1); birthday.add(new Date(2000,9,23)); birthday.add(new
		 * Date(2000,9,23)); birthday.add(new Date(2000,9,23)); birthday.add(new
		 * Date(2000,9,23)); birthday.add(new Date(2000,9,23)); birthday.add(new
		 * Date(2000,9,23)); birthday.add(new Date(2000,9,23)); birthday.add(new
		 * Date(2000,9,23));
		 */
		birthday.add(d);
		birthday.add(d1);
		birthday.add(d2);
		birthday.add(d3);
		birthday.add(d4);
		birthday.add(d5);
		birthday.add(d6);
		birthday.add(d7);
		
		boolean bool = d.isLeapYear();
		
		System.out.println(bool);

	}

}
