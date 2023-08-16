package com.tnsif.core;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the name of person=");
		String name=ob.next();
		
		System.out.println("enter the age of the person=");
		int age=ob.nextInt();
		
		System.out.println("enter the gender=");
		String gender=ob.next();
		
		System.out.println("enter the income=");
		int income=ob.nextInt();
		 Person person=new Person();
		 person.setName(name);
		 person.setAge(age);
		 person.setGender(gender);		 
		 person.setIncome(income);
		 
		 System.out.println(person);
		 
		 





	}

}
