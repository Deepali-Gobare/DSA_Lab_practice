package com.demo.queue;

public class queueLinkedList {
	Node front,rare=null;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}
	}
	public boolean isEmpty() {
		return front==null && rare==null;
	}
	public void enqueue(int val) {
		Node newnode =new Node(val);
		if(isEmpty()) {
		front=newnode;
		rare=newnode;
	}else {
		rare.next=newnode;
		rare=newnode;
	}
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("the list is empty");
		}else {
			Node temp=front;
			front=temp.next;
			if(front==null) {
				rare=null;
			}
			temp.next=null;
			return temp.data;
		}
		return -1;
	}
	
}
