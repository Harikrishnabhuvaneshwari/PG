package com.pg.sorting;

public class MergeSort {

	void divide(int[] integerArray,int n){

		if(n>1){
			int middle=n/2;
			int[] leftArray=new int[middle];
			int[] rightArray=new int[n-middle];
			for(int l=0;l<middle;l++){
				leftArray[l]=integerArray[l];
			}
			for(int r=0;r<n-middle;r++){
				rightArray[r]=integerArray[middle+r];
			}
			divide(leftArray,middle);
			divide(rightArray,n-middle);
			conquer(integerArray, leftArray, rightArray, middle, n-middle);
		}

	}

	void conquer(int[] arr,int[] leftArray,int[] rightArray,int l,int r){
		int i=0,j=0,k=0;
		while(i<l&&j<r){
			if(leftArray[i]>rightArray[j]){
				arr[k++]=rightArray[j++];
			}else{
				arr[k++]=leftArray[i++];
			}
		}

		while(i<l){
			arr[k++]=leftArray[i++];
		}
		while(j<r){
			arr[k++]=rightArray[j++];
		}

	}

}
