package com.pg.java.ComparatorVsComparable;

import java.util.Comparator;

public class SortByRollno implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.rollNo-arg1.rollNo;
	}

}
