package com.pg.sorting;

public class BubbleSort {
	public void bubbleSort(int[] integerArray){
		for(int i=0;i<integerArray.length;i++){
			for(int j=0;j<integerArray.length-i-1;j++){
				if(integerArray[j]>integerArray[j+1]){
					int temp=integerArray[j];
					integerArray[j]=integerArray[j+1];
					integerArray[j+1]=temp;
				}
			}
		}

	}
}
