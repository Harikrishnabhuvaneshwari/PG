package com.pg.searching;

import java.util.Arrays;

public class BinarySearch {

	public static void binarySearch(int[] arr,int searchVar){
		int min=0;
		int max=arr.length-1;
		Arrays.sort(arr);  //because binary search will work only on sorted array.
		while(max>=min){
			int mid=(min+max)/2;
			if(arr[mid]==searchVar){
				System.out.println("found "+searchVar);
				return;
			}else if(arr[mid]>searchVar){
				max=mid-1;
			}else{
				min=mid+1;
			}
		}
		System.out.println("Not found");
	}

}
