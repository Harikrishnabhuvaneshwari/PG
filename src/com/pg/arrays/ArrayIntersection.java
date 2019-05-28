package com.pg.arrays;

import java.util.Arrays;

public class ArrayIntersection {

	static void intersection(int[] A,int[] B){
		int i=0,j=0,k=0;
		int[] result=new int[Math.min(A.length, B.length)];
		Arrays.sort(A);
		Arrays.sort(B);
		while(i<A.length&&j<B.length){
			if(A[i]>B[j]){
				j++;
			}else if(B[j]>A[i]){
				i++;
			}else{
				result[k++]=A[i++];
				j++;
			}
		}
		display(result);
	}

	static void display(int[] result){
		System.out.print("{");
		for(int a:result){
			System.out.print(a+" ");
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		int[] a1={89,24,75,11,23};
		int[] a2={89,2,4,89,89};
		int[] a3={1,2,3,4,5,6};
		int[] a4={3,4,5,6,7};
		ArrayIntersection.intersection(a1, a2);
		ArrayIntersection.intersection(a3, a4);
	}

}
