package com.demo.test;

import com.demo.stack.MyArrayStack;
import com.demo.stack.StringReverseStack;

public class testParenthises {
	 public static void main(String[] args) {
		
	
           String str="{{()[()}}]";
           StringReverseStack st=new StringReverseStack(20);
            boolean flag=isBalance(st,str);
            if(flag) {
            	System.out.println("string is balanced");
            }else {
            	System.out.println("String is not balanced");
            }
       }
	 public static boolean isBalance(StringReverseStack st,String str) {
		 for(int i=0;i<str.length();i++) {
			 char ch=str.charAt(i);
			 if(ch=='(' || ch=='{'||ch=='[') {
				 st.push(ch);
			 }else {
				 if(!st.isEmpty()) {
					 char ch1=st.pop();
					 if((ch=='}' && ch1!='{') || (ch==']' && ch1!='[')||( ch==')' && ch1!='(' ) ) {
						 return false;
					 }
				 }
			 }
		 }
		 if(st.isEmpty()) {
		  return true;
		 }else {
			 return false;
		 }
	 }
}
