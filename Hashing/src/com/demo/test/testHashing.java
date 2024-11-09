package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Hashing;

public class testHashing {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num=7;
			Hashing[] hashtable=new Hashing[num];
			for(int i=0;i<hashtable.length;i++) {
				hashtable[i]=new Hashing();
			}
			displayhashTable(hashtable);
			int choice=0;
			do {
			System.out.println("1. Add data \n 2. Search data\n 3. delete data\n 4. exit\n choioce: ");
			choice=sc.nextInt();
	        switch(choice) {
	        case 1->{
	        	System.out.println("enter num");
	        	int val=sc.nextInt();
	        	adddataInHashTable(hashtable, val);
	        	displayhashTable(hashtable);
	        }
	        case 2->{
	        	System.out.println("enter num");
	        	int val=sc.nextInt();
	        	boolean status=searchdata(hashtable, val);
	        	if(status) {
	        		System.out.println("num found");
	        	}else {
	        		System.out.println("num not found");
	        	}
	        }
	        case 3->{
	        	System.out.println("enter num");
	        	int val=sc.nextInt();
	        	boolean status=deleteFromHashTable(hashtable, val);
	        	if(status) {
	        		System.out.println("num deleted");
	        		
	        	}else {
	        		System.out.println("number not deleted");
	        	}
	        	displayhashTable(hashtable);
	        }
	        case 4->{
	    		System.out.println("Thank you for visiting");
	    		sc.close();
	    	}
	        default->System.out.println(" choice not present");
	        }
			}while(choice!=4);
			
		}

		private static void adddataInHashTable(Hashing[] hashtable, int data) {
			int bucket=data%hashtable.length;
			hashtable[bucket].addNode(data);
			
		}
		private static boolean deleteFromHashTable(Hashing[] hashtable, int data) {
			int bucket=data%hashtable.length;
			return hashtable[bucket].deleteByval(data);
			
		}
		
		private static boolean searchdata(Hashing[] hashtable, int data) {
			int bucket=data%hashtable.length;
			return hashtable[bucket].searchByval(data);
		}
		private static void displayhashTable(Hashing[] hashtable) {
			for(int i=0;i<hashtable.length;i++) {
				System.out.print(i+"--->");
				hashtable[i].displayData();
				System.out.println();
			}
			System.out.println("----------------");
		}
		

	}



