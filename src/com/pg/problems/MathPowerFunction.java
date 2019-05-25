package com.pg.problems;

public class MathPowerFunction {

	static int power(int number,int power){
		if(power==0)
			return 1;
		int temp=power(number, power/2);
		if(power%2==0){
			return temp*temp;
		}
		else{
			return temp*temp*number;	
		}
	}

	public static void main(String[] args) {
		System.out.println(MathPowerFunction.power(5, 2));
	}

}
