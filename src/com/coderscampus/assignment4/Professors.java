package com.coderscampus.assignment4;

public class Professors implements Comparable<Professors>{
	private String studentId;
	private String name;
	private String course;
	private Integer grade;
	
	public Professors (String studentId, String name, String course, Integer grade) {
		this.studentId = studentId;
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "[studentId=" + studentId + ", name=" + name + ", course=" + course + ", grade=" + grade
				+ "]";
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	
	@Override
	public int compareTo(Professors that) {
		if ( that == null) {
			throw new NullPointerException("Cannot compare to a null professor.");
		}
		return that.grade.compareTo(this.grade);
	}
}
