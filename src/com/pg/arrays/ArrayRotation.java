package com.pg.arrays;

public class ArrayRotation {

	public static void rotate(int[] arr,int by){
//		for(int i=0;i<by;i++){
//			int temp=arr[0];
//			for(int j=0;j<arr.length;j++){
//				if(j+1<arr.length)
//					arr[j]=arr[j+1];
//				else
//					arr[j]=temp;	
//			}
//		}
		
		 for(int j=by;j<by+arr.length;j++)
	        {
	                System.out.print(arr[j%arr.length]+" ");
	        }
//		dispaly(arr);
	}

	private static void dispaly(int[] arr) {
		for(int a:arr)
			System.out.print(a+" ");
	}

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		rotate(arr,2);
	}
}
