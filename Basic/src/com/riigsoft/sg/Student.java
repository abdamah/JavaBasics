package com.riigsoft.sg;

public class Student {
	private int sno;
	private String sname;
	private String course;

	public Student(int sno, String sname, String course) {
		this.setSno(sno);
		this.setSname(sname);
		this.setCourse(course);
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {

		return course;
	}

	public void setCourse(String course) {
		if (course.equalsIgnoreCase("Spring") || course.equalsIgnoreCase("Hibernate") || course.equalsIgnoreCase("DP"))
			this.course = course;
		else
			this.course = "Spring";
	}

}
