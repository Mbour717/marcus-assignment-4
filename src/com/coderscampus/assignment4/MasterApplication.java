package com.coderscampus.assignment4;

import java.util.Arrays;

public class MasterApplication {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		Professors[] college = fileService.getStudentFile();
		Professors[] sc = new Professors[100];
		sc[1] = college[1];
		
		Arrays.sort(sc);
		for (Professors file : sc) {
			System.out.println(file);
		}
//		String[] sc = new String[100];
//		sc[0] = college[0].getCourse();
//		Arrays.sort(sc);
//		for (String student : sc) {
//			System.out.println(student);
//		}
	}

}
