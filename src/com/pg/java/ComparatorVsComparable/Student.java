package com.pg.java.ComparatorVsComparable;


public class Student implements Comparable<Student> {
	public int rollNo;
	public String name,address;
	public Student(int rollNo,String name,String address) {
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("equal");
//		return this.rollNo==((Student)obj).rollNo;
//	}
//	
//	@Override
//	public int hashCode() {
//		System.out.println("invoked by set");
//		return Integer.hashCode(this.rollNo);
//	}

	public String toString(){
		return this.rollNo+" "+this.name+" "+this.address;
	}

	//class's natural ordering method. This is used when we use Collections's sort() method on list of Student objects.
	//This method should be consistent with equals method because when its used with
	//sorted set or sorted map class it behaves badly.
	@Override
	public int compareTo(Student o) {
		return this.rollNo-o.rollNo;
	}
}
