package com.demo.test;

import com.demo.linkedlist.CircularLinkedList;

public class TestCircularLinkedList {
	
	public static void main(String[] args) {
		CircularLinkedList cll=new CircularLinkedList();
		cll.addData(9);
		cll.addData(7);
        cll.addData(2);
        cll.addData(9);
        cll.displaydata();
        cll.addByposition(23,7 );
        cll.displaydata();
	}

}
