package com;

import sopan.lang.MyString;

public class TestingMyString {

	public static void main(String[] args) {
	
		MyString s=new MyString();
		System.out.println(s.hashCode());
		MyString t=new MyString("Sopan");
		MyString p=new MyString("Sopan");
		MyString g=p.intern();
		System.out.println(t.hashCode());
		System.out.println(g.hashCode());
		System.out.println(p.toLowerCase());
		System.out.println(p.toUpperCase());
		System.out.println(p.subString(1,4));
		System.out.println(p.charAt(2));
		System.out.println(p.compareTo(p));		
		
		//String Out of Bound Exception
		System.out.println(p.subString(-1,4));
		System.out.println(p.subString(1,6));
	}

}
