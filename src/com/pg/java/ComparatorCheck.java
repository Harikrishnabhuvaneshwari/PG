package com.pg.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorCheck {
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(56, "hari","chennai"));
		students.add(new Student(23, "krishna","chennai"));
		students.add(new Student(6, "rama","chennai"));
		students.add(new Student(12, "ragu","chennai"));
		students.add(new Student(45, "riza","chennai"));
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
		Collections.sort(students, new SortByRollno());
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
