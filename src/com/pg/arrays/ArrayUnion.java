package com.pg.arrays;

import java.util.Arrays;

public class ArrayUnion {

	public static void union(int[] A,int[] B){
		int i=0,j=0,k=0;
		int[] result=new int[A.length+B.length];
		Arrays.sort(A);
		Arrays.sort(B);
		while (i<A.length&&j<B.length) {
			if(A[i]<B[j]){
				result[k++]=A[i++];
			}else if(A[i]>B[j]){
				result[k++]=B[j++];
			}else{
				result[k++]=A[i++];
				j++;
			}
		}

		while(i<A.length){
			result[k++]=A[i++];
		}
		while(j<B.length){
			result[k++]=B[j++];
		}
		display(result);
	}

	static void display(int[] result){
		System.out.print("{");
		for(int a:result){
			System.out.print(a+" ");
		}
		System.out.print("}");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a1={89,24,75,11,23};
		int[] a2={89,2,4,89,89,213,456,789,678};
		int[] a3={1,2,3,4,5,6};
		int[] a4={89};
		ArrayUnion.union(a1, a2);
		ArrayUnion.union(a3, a4);
	}

}
