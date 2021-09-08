package mypractice;

public class string_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "uday";
		String str2 = "uday";
		//this wont work as strings are not mutable!!
		str1.concat("hello");
		// comparing heap locations not strings them selves
		if(str1 == str2) {
			System.out.println("str1 == str2 i.e in same location to save memory");
		}
		String str3 = new String("uday");
		String str4 = new String("uda");
		
		// heap location are not same in this case so they won't be equal
		// than how to compare contents of strings WE USE equals
		if (str3 == str4) {
			System.out.println("str3 == str4");
		}
		else {
			System.out.println("str3 != str4");
		}
		System.out.println("out: "+str1);
		
		if(str3.equals(str4)) {
			System.out.println("str3 equals str4");
		}
		else {
			System.out.println("str3 not equals to str4");
		}
		
		if(str3.compareTo(str4)==0) {
			System.out.println("str3 and str4 are same: ");
		}
		else {
			System.out.println("str3 and str4 not same");
		}

		// string methods
		int len = str1.length();
		System.out.println(str1.charAt(0)+" | "+str1.charAt(len-1));
		
		String s1 = str1.toUpperCase();
		System.out.println(s1);
		
		String s2 = "hello world";
		if(s2.contains("world")) {
			System.out.println("s2 contains world");
		}
		//creates s3 from s2 from index 5 i.e " world"
		String s3 = s2.substring(5);
		System.out.println(s3);
		
		String s4 = s2.substring(3, s2.length());
		System.out.println(s4);
		
		char[] arr = s2.toCharArray();
		for(char ch: arr) {
			System.out.print(ch+" ");
		}
		
		String names = "uday, akash, shashank";
		String[] strr = names.split(",");
		for(String sst : strr) {
			System.out.println(sst.trim());
			
		}
		//StringBuffer is mutable
		StringBuffer hk = new StringBuffer("hello frnds ");
		hk.append("bye frnds");
		//hk.
		
		//System.out.println(hk);
	}

}
