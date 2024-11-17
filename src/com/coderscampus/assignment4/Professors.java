package com.coderscampus.assignment4;

public class Professors implements Comparable<Professors>{
	private String studentId;
	private String name;
	private String course;
	private String grade;
	
	public Professors (String studentId, String name, String course, String grade) {
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// compare by grade and sort it to an array then pass it on to ProfessorsService to filewrite.
	@Override
	public int compareTo(Professors that) {
			if (this.grade.compareTo(that.grade) == 0) {
				return this.grade.compareTo(that.grade);
			}
			return 0;
	}
	
}
