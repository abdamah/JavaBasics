package com.riigsoft.sg;

public class App {

	public static void main(String[] args) {
		Student s= new Student(1001, "Ahmed", "Spring");
		s.setCourse("DP");
		System.out.println(s.getCourse());
	}

}
