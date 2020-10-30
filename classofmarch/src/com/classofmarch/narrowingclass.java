package com.classofmarch;

public class narrowingclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a =12.4; // 8 byte
		float b =(float)a;//12/4
		long c = (long)b;//12
		int d = (int)c; //
		
		short e =(short)d; //
		byte f = (byte)e; //12 1 byte
		
		
		System.out.println("double:" + a);
		System.out.println("float:" + b);
		System.out.println("long:" + c);
		System.out.println("int:" + d);
		
		System.out.println("short:" + e);
		System.out.println("byte:" + f);

	}

}
