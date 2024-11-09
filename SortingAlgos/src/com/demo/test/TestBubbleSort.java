package com.demo.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr= {54,44,2,1,56,55,74,5,66};
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(arr));

	}
	private static void improvedbubbleSort(int[] arr) {
		int n=arr.length;
		int swapcount=0;

		for(int i=0;i<n;i++) {
			
		   
			for(int j=1;j<(n-i);j++) {
				
				if(arr[j-1]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapcount++;
				}
			}
			
			System.out.println("iteration "+(i+1)+" Swapcount : "+swapcount);
			System.out.println(Arrays.toString(arr));
			if(swapcount==0) {
				break;
			}
			swapcount=0;
		}
			
		}

	private static void bubbleSort(int[] arr) {
		int n=arr.length;
		int swapcount=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				
				if(arr[j-1]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapcount++;
				}
			}
			
			System.out.println("iteration "+(i+1)+" Swapcount : "+swapcount);
			System.out.println(Arrays.toString(arr));
			swapcount=0;
			
		}
		
	}

}
