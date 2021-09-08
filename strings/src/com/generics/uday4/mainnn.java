package com.generics.uday4;

public class mainnn {

	public static void main(String[] args) {
		
	Pair<String, String> myobj = new Pair<>();
	
	myobj.setKey("key1");
	myobj.setValue("uday");
	
	Pair<String, java.util.Date> myobj1 = new Pair<>();
	
	myobj1.setKey("key 2");
	myobj1.setValue(new java.util.Date());
	
	System.out.println("myobj  "+myobj.getKey()+" &  value: "+myobj.getValue());
	System.out.println("myobj1  "+myobj1.getKey()+" &  value: "+myobj1.getValue());
	
	
	}
	
	
	
	
	
	
	
}
