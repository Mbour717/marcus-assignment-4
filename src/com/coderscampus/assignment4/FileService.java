package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	public Professors[] getStudentFile() {

		BufferedReader fileReader = null;

		try {
			int i = 0;
			String line = null;
			Professors[] courses = new Professors[100];
			fileReader = new BufferedReader(new FileReader("files/student-master-list.csv"));
			fileReader.readLine();

			while ((line = fileReader.readLine()) != null) {
				String[] data = line.split(",");
				Professors professor = new Professors(data[0], data[1], data[2], Integer.parseInt(data[3]));
				courses[i] = professor;
				i++;
			}
			return courses;
		} catch (FileNotFoundException e) {
			System.out.println("Oops, File not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("There is a IOException!");
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void printFile(String filename) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			System.out.println(filename + "\n");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("--------");
		} catch (IOException e) {
			System.out.println("An error occurred while reading file: " + filename);
			e.printStackTrace();
		}
	}
}
