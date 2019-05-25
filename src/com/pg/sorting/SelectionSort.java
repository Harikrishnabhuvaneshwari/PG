package com.pg.sorting;

public class SelectionSort {
	public void selectionSort(int[] integerArray){
		for(int i=0;i<integerArray.length;i++){
			int minIndex=i;
			for(int j=i;j<integerArray.length;j++){
				if(integerArray[minIndex]>integerArray[j]){
					minIndex=j;
				}
			}
			int temp=integerArray[i];
			integerArray[i]=integerArray[minIndex];
			integerArray[minIndex]=temp;
		}
	}
}
