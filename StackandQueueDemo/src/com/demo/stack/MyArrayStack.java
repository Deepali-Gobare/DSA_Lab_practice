package com.demo.stack;

public class MyArrayStack{
	int[] arr;
	int top;

	public MyArrayStack() {
		this.arr=new int[10];
		this.top=-1;
	}

	public MyArrayStack(int size) {
		super();
		this.arr = new int[size];
		this.top = -1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public void push(int val) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top++;
			arr[top]=val;
		}
	
	}
	public int pop(){
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			int n=arr[top];
			top--;
			return n;
		}
		return -1;
	}
}
	





































//public class MyArrayStack{
//		int[] arr;
//		int top;
//		
//		public MyArrayStack() {
//			this.arr=new int[10];
//			this.top=-1;
//		}
//
//		public MyArrayStack(int size) {
//			super();
//			this.arr = new int[size];
//			this.top = -1;
//		}
//		public boolean isEmpty() {
//			return top==-1;
//		}
//		
//		public boolean isFull() {
//			return top==arr.length-1;
//		}
//		
//		public void push(int val) {
//			if(isFull()) {
//				System.out.println("The Stack is full");
//			}
//			top++;
//			arr[top]=val;
//		}
//		public int pop() {
//			if(isEmpty()) {
//				System.out.println("The stack is empty");
//			}
//			int n=arr[top];
//			top--;
//			return n;
//		}
//		
//		
//	}
//
//
