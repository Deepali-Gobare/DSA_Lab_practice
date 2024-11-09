package com.demo.test;

import com.demo.stack.MyArrayStack;
import com.demo.stack.MyStackList;

public class testStack {
	public static void main(String[] args) {
		MyStackList st=new MyStackList();
		//MyArrayStack st=new MyArrayStack();
		st.push(2);
		st.push(8);
		st.push(0);
		st.push(11);
		st.push(9);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
