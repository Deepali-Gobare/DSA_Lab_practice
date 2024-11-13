package com.demo.test;

import java.util.Arrays;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr= {65,35,26,14,23,12,91};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		insertionsort(arr);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionsort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key) {
				
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			System.out.println("iteration : "+i);
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
