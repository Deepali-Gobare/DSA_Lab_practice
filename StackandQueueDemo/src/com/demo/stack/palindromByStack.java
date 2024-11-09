package com.demo.stack;

public class palindromByStack {
	char[] arr;
	int top;

	public palindromByStack() {
		this.arr=new char[10];
		this.top=-1;
	}

	public palindromByStack(int size) {
		super();
		this.arr = new char[size];
		this.top = -1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public void push(char val) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top++;
			arr[top]=val;
		}
	
	}
	public char pop(){
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			char n=arr[top];
			top--;
			return n;
		}
		return ' ';
	}
}
