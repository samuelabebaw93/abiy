package com.classofmarch;

public class wideningclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte a =10; // -128-127
		short b =a;
		int c = b;
		long d = c; //10
		
		float e = d; //10.0
		double f = e; //10.0
		
		
		System.out.println("byte:" + a);
		System.out.println("short:" + b);
		System.out.println("int:" + c);
		System.out.println("long:" + d);
		
		System.out.println("float:" + e);
		System.out.println("double:" + f);
		
	}

}
