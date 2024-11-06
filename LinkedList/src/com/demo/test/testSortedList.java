package com.demo.test;

import com.demo.linkedlist.SortedLinkedList;

public class testSortedList {
	
	public static void main (String args[]) {
	SortedLinkedList sl = new SortedLinkedList();	
	sl.addInsortedlist(5);
	sl.addInsortedlist(3);
	sl.addInsortedlist(7);
	sl.addInsortedlist(8);
	sl.addInsortedlist(10);
	sl.displayList();
	System.out.println(".............");	
//	sl.deleteByValue(7);
	 sl.deleteByValue(8); 
	sl.displayList();
	}

}
