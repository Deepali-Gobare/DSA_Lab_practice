package com.demo.test;
import com.demo.stack.palindromByStack;

public class testPalindrom {

	    public static void main(String[] args) {
	        palindromByStack st = new palindromByStack(20);
	        String s = "string";
	        
	        for (int i = 0; i < s.length(); i++) {
	            if (!st.isFull())
	                st.push(s.charAt(i));
	        }

	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != st.pop()) {
	                isPalindrome = false;
	                break;
	            }
	        }

	      
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string  is not a palindrome.");
	        }
	    }
	}

