package com.pg.java.ComparatorVsComparable;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorCheck {
	public static void main(String[] args) {
		Set<Student> students=new TreeSet<>((a,b)->b.rollNo-a.rollNo);
		students.add(new Student(56, "hari","chennai"));
		students.add(new Student(23, "krishna","chennai"));
		students.add(new Student(6, "rama","chennai"));
		students.add(new Student(12, "ragu","chennai"));
		students.add(new Student(45, "riza","chennai"));
		students.add(new Student(45, "riza","chennai"));
		
		Map<Student,Integer> map=new TreeMap<>((a,b)->a.name.compareTo(b.name));
		map.put(new Student(56, "hari","chennai"), 1);
		map.put(new Student(23, "krishna","chennai"),2);
		map.put(new Student(6, "rama","chennai"),3);
		map.put(new Student(12, "ragu","chennai"),4);
		map.put(new Student(45, "riza","chennai"),5);
		map.put(new Student(45, "riza","chennai"),6);
		
		
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
		
		System.out.println(map);
//		Collections.sort(students,comparator);
//		for (Student student : students) {
//			System.out.println(student);
//		}
	}
}
