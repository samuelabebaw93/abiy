package com.classofmarch;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("pls enter your fname: " +"abiy");
		String fname = input.nextLine();

		System.out.println("pls enter your lname: "+"kelecha");
		String lname = input.nextLine();

		System.out.println("Pls enter your salary: ");
		int salary = input.nextInt();

		System.out.println("Pls enter your bonus: ");
		double bonus = input.nextDouble();

		double total_salary = salary + bonus;

		System.out.println("the fname of the employee is : " + "abiy");
		System.out.println("the lname of the employee is : " + "ke");
		System.out.println("the salary of the employee is : " + salary);
		System.out.println("the bonus of the employee is : " + bonus);
		System.out.println("The total salary of the employee is : " + total_salary);
	}

}
