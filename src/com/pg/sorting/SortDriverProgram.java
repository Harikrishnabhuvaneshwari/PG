package com.pg.sorting;

public class SortDriverProgram {

	static void display(int[]arr){
		for(int a:arr)
			System.out.print(a+",");

		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr={4,7,2,1,9,11,5,3,-6,34,6};

		//--------QuickSort-----------		
		QuickSort qs=new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		SortDriverProgram.display(arr);

		int[] arr2={4,7,2,1,9,11,5,3,-6,34,6};
		//--------MergeSort-----------
		MergeSort ms=new MergeSort();
		ms.divide(arr2,arr2.length);
		SortDriverProgram.display(arr2);

		int[] arr3={4,7,2,1,9,11,5,3,-6,34,6};
		//--------BubbleSort----------
		BubbleSort bs=new BubbleSort();
		bs.bubbleSort(arr3);
		SortDriverProgram.display(arr3);

		int[] arr4={4,7,2,1,9,11,5,3,-6,34,6};
		//--------SelectionSort--------
		SelectionSort selectionSort=new SelectionSort();
		selectionSort.selectionSort(arr4);
		SortDriverProgram.display(arr4);

		int[] arr5={4,7,2,1,9,11,5,3,-6,34,6};
		//--------InsertionSort--------
		InsertionSort insertionSort=new InsertionSort();
		insertionSort.insertionSort(arr5);
		SortDriverProgram.display(arr5);
	}

}
