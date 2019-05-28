package com.pg.problems;

public class GCD {

	static int gcd(int a,int b){
		if(b==0)    //base condition
			return a;
		else
			return gcd(b,a%b);
	}

	public static void main(String[] args) {
		System.out.println(gcd(25,625));
	}

}
