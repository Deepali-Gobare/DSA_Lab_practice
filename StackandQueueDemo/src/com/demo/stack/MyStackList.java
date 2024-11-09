package com.demo.stack;

public class MyStackList {
		Node top=null;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.next=null;
			this.data = data;
		}
		
	}
	public boolean isEmpty() {
		return top==null;
	}
	public void push(int val) {
		Node newnode=new Node(val);
		if(top==null) {
			top=newnode;
		}else {
			newnode.next=top;
			top=newnode;
		}
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			Node temp=top;
			top=temp.next;
			temp.next=null;
			return temp.data;
		}
	return -1;		
	}
	

}
