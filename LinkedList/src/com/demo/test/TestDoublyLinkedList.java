package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedList dlst = new DoublyLinkedList();
		dlst.addNode(5);
		dlst.addNode(7);
		dlst.addNode(9);
		dlst.addNode(11); 
		dlst.addNode(13);
		//dlst.displaydata();
		//dlst.addByPosition(3,100);
		
//		dlst.deleteByPosition(3);
//		dlst.displaydata();
		dlst.addBeforPosition(100, 9);
		dlst.addAfterPosition(100, 9);
		dlst.displaydata();
		System.out.println("-------------");
		dlst.displayReverseData();
	}
}
