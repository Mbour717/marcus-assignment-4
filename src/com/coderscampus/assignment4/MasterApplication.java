package com.coderscampus.assignment4;

import java.util.Arrays;

public class MasterApplication {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		Professors[] college = fileService.getStudentFile();
		ProfessorsService fileWriterService = new ProfessorsService();

		Arrays.sort(college);


		fileWriterService.writeToCSV(college);
		
		System.out.println("------");
		
		FileService.printFile("course1.csv");
		FileService.printFile("course2.csv");
		FileService.printFile("course3.csv");
	}
}
