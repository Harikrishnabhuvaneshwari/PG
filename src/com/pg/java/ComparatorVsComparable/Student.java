package com.pg.java.ComparatorVsComparable;


public class Student implements Comparable<Student> {
	public int rollNo;
	public String name,address;
	public Student(int rollNo,String name,String address) {
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}

	public String toString(){
		return this.rollNo+" "+this.name+" "+this.address;
	}

	//class's natural ordering method. This is used when we use Collections's sort() method on list of Student objects.
	@Override
	public int compareTo(Student o) {
		return this.rollNo-o.rollNo;
	}
}
