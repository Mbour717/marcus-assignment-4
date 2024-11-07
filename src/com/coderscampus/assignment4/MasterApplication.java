package com.coderscampus.assignment4;

import java.util.Arrays;

public class MasterApplication {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		
		Professors[] college = fileService.getStudentFile();
		String[] sc = new String[101];
		
		sc[0] = college[0].getCourse();
		Arrays.sort(sc);
		for (String student : sc) {
			System.out.println(student);
		}
	}

}
