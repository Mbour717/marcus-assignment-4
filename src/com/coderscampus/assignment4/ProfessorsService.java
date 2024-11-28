package com.coderscampus.assignment4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProfessorsService {

	public void writeToCSV(Professors[] professors) {
	
			try (BufferedWriter course1 = new BufferedWriter(new FileWriter("course1.csv"));
					BufferedWriter course2 = new BufferedWriter(new FileWriter("course2.csv"));
					BufferedWriter course3 = new BufferedWriter(new FileWriter("course3.csv"))) {

				
				course1.write("Student ID,Student Name,Course,Grade");
				course1.newLine();
				course2.write("Student ID,Student Name,Course,Grade");
				course2.newLine();
				course3.write("Student ID,Student Name,Course,Grade");
				course3.newLine();

				
				for (Professors professor : professors) {
					if (professor != null) {
						String course = professor.getCourse();
						String studentData = professor.getStudentId() + "," + professor.getName() + "," + course + ","
								+ professor.getGrade();

						if (course.startsWith("APMTH")) {
							course1.write(studentData);
							course1.newLine();
						} else if (course.startsWith("COMPSCI")) {
							course2.write(studentData);
							course2.newLine();
						} else if (course.startsWith("STAT")) {
							course3.write(studentData);
							course3.newLine();
						}

					}
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("An error occurred while writing to the file.");
			}

			System.out.println("Data successfully written to the CSV files.");

		} 
	}
