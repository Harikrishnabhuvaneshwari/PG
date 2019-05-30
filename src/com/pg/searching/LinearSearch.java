package com.pg.searching;

public class LinearSearch {
	public static void linearSearch(int[] arr,int searchVar){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==searchVar){
				System.out.println("found "+searchVar);
				return;
			}
		}
		System.out.println("Not found");
	}
}
