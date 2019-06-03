package com.pg.problems;

//finding divisors(number) of a number.
//If a number divides N completely(i.e., remainder=0) then that number is a factor of N or
//if two no's say a*b=c then a and b are factors of c.
public class FactorsOfNumber {

	static void findFactors(int n){
		System.out.print("Factors of "+n+" are ");
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
					System.out.print(i+" ");
				}
			}
	}

	public static void main(String[] args) {
		FactorsOfNumber.findFactors(1000);
	}

}
