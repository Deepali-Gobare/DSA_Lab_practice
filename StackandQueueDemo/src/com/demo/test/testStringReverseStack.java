package com.demo.test;

import com.demo.stack.StringReverseStack;

public class testStringReverseStack {
            public static void main(String[] args) {
            
            	String s="This is string";
				StringReverseStack st=new StringReverseStack(30);
				
				for(int i=0;i<s.length();i++) {
					if(!st.isFull())
						st.push(s.charAt(i));
				}
				while(!st.isEmpty()) {
					System.out.println(st.pop());
				}
			}
            
}
