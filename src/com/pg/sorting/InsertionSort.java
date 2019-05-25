package com.pg.sorting;

public class InsertionSort {
	public void insertionSort(int[] integerArray){
		for(int i=0;i<integerArray.length;i++){
			int j=i;
			while(j>0){
				if(integerArray[j]<integerArray[j-1]){
					int temp=integerArray[j];
					integerArray[j]=integerArray[j-1];
					integerArray[j-1]=temp;
				}
				j--;
			}
		}
	}
}
