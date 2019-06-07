package com.pg.trainer;

@FunctionalInterface
public interface Interf {
	int i=10;
	int y=0;
	int test(int n);
	default void print(Object s){
		System.out.println(s+" printed");
	}
}
