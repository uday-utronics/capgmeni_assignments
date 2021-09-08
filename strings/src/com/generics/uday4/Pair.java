package com.generics.uday4;

public class Pair<K, E> {

	K key;
	E value;
	
	/*
	 * public Pair(K key, V value) { this.key = key; this.value = value; }
	 */

  

    public void setKey(K key){ this.key = key; }
    public void setValue(E value){ this.value = value; }
    
    public K getKey(){ return key; }
    public E getValue(){ return value; }

	/*
	 * private K key; private V value;
	 */
}
