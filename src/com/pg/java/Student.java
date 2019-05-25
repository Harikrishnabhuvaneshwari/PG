package com.pg.java;


public class Student {
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
}
