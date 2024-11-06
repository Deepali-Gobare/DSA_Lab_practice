package com.demo.linkedlist;

public class CircularLinkedList {
	
	Node head=null;
	Node tail=null;
	   class Node{
		   int data;
		   Node next;
		   Node tail;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.tail = null;
		}
		   
	   }
          public void addData(int val) {
        	  Node newNode=new Node(val);
        	 
        	  if(head==null) {
        		  head=newNode;
        		  tail=newNode;
        		  
        	  }else {
        		  tail.next=newNode;
        		  tail=newNode;
        	  }
        	  tail.next=head;
          }
          
          public void displaydata() {
      		if(head==null)
      			System.out.println("list is empty");
      		else {
      			Node temp=head;
      			while(temp.next!=head) {
      				System.out.println(temp.data);
      				temp=temp.next;
      			}
      			System.out.println(temp.data);
      			System.out.println("--------------");
      		}
      		
      	}
}
