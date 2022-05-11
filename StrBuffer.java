package com.mapmay2;

public class StrBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");  //similar to String but mutable and thread-safe
		
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		
		StringBuilder sbuilder = new StringBuilder(sb);
		System.out.println(sb);
		System.out.println(sbuilder.append(" little benny"));
	}

}
