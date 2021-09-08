package strings;

public class assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		String str2 = " I Am Robot !!";
		String str3 = str+str2;
		/*
		int i = str.length();
		System.out.println("length: "+i);
		System.out.println("to lower case "+str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println("replace"+str3.replace("o", "$"));
		System.out.println(str3.contains("hello"));
		System.out.println("match"+str3.equals(str3));*/
		 // string buffer--> time synchronised, used in multi threading
		StringBuffer buffer = new StringBuffer("i am mutable");
		System.out.println(buffer);
		buffer.append(str2);
		System.out.println(buffer);
		buffer.insert(13, str3);
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		//StringBuider not sychronised , not thread safe
		StringBuilder builder = new StringBuilder("i am StringBuilder , i am fast and also mutable");
		builder.append(str2);
		System.out.println(builder);
		builder.insert(18, " inserted");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
		
		

	}

}
