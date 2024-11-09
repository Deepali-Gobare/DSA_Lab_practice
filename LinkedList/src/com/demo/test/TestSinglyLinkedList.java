package com.demo.test;

import com.demo.linkedlist.SinglyLinkedList;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
	
	SinglyLinkedList lst= new SinglyLinkedList();
	lst.addNode(2);
	lst.addNode(1);
	lst.addNode(3);
	lst.addNode(4);
//	lst.addByPosition(22,3);
	lst.display();
//	int pos=lst.searchByValue(4);
//	System.out.println("The position of the given val is "+pos);
	//lst.deleteByValue(3);
//	lst.display();
	lst.deleteByPosition(3);
	lst.display();
	}

}
