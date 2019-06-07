package com.pg.java.interfacee;

public interface Right {
	
	default void m1(){
		System.out.println("Right interface implementation");
	}
	
	public static void mainn(String[] args) {
		System.out.println("Interface main method");
	}
	
}
