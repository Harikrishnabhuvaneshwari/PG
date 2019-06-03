package com.pg.problems;

public class SquareRoot {
	
	//binary search approach for finding square root 
	private static double findSqrt(double number) {
		double low=0;
		double high=number+1;
		double mid=0;
		while((high-low)>0.000001){
			mid=(high+low)/2;
			if(mid*mid>number){
				high=mid;
			}else{
				low=mid;
			}
		}
		return Math.round(mid); 
	}

	public static void main(String[] args) {
		System.out.println(findSqrt(4));
	}

}
