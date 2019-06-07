package com.pg.java.interfacee;

public interface Left {
	
	default void m1(){
		System.out.println("Left Interface Implementation");
		Right.mainn(null);
	}
	
}
