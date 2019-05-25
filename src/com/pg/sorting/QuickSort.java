package com.pg.sorting;

public class QuickSort {

	void quickSort(int[] arr,int f,int e){
		if(e>f){
			int partitionValue=part(arr,f,e);
			quickSort(arr,f,partitionValue-1);
			quickSort(arr,partitionValue+1,e);
		}
	}
	
	
	int part(int[]arr,int f,int e){
		int p=e;
		int j=f;
		int i=j-1;
		for(int k=j;k<e;k++){
			if(arr[p]>arr[k]){
				i=i+1;
				int temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[p];
		arr[p]=arr[i+1];
		arr[i+1]=temp;
		return i+1;
	}


}
