package com.riigsoft;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student 1 Details");
		Student s1= new Student();
		System.out.println("Enter Sno:\t");
		s1.setSno(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Sname\t");
		s1.setSname(sc.nextLine());
		System.out.println("Enter Course:\t");
		s1.setCourse(sc.nextLine());

		System.out.println("Enter Fee:\t");
		s1.setFee(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Student 2 Details");
		Student s2= new Student();
		System.out.println("Enter Sno:\t");
		s2.setSno(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Sname\t");
		s2.setSname(sc.nextLine());
		System.out.println("Enter Course:\t");
		s2.setCourse(sc.nextLine());
		
		System.out.println("Enter Fee:\t");
		s2.setFee(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("s1 and s2 Objects details");
		System.out.println(s1);
		System.out.println(s2);
		if(s1.hashCode()==s2.hashCode()) {
			System.out.println("Both Students belong to same bucket/group ");
		}else {
			System.out.println("Both Students belong to diff bucket/group ");
			
		}
		if(s1.equals(s2))
			System.out.println("Both Student are equal(duplicate)");
		else 
			System.out.println("Both Student are not equal(duplicate)");
	}

}
