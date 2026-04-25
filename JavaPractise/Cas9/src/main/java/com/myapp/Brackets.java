package com.myapp;

import java.util.Stack;

public class Brackets {

  public static boolean brackets(String bs) {
		Stack<Character> s = new Stack<Character>();
		
		for(int i = 0; i < bs.length(); i++) {
			char c = bs.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				s.push(c);
			}
			else {
				if(s.empty()) return false;
				if(c == ')' && s.peek() != '(') return false;
				if(c == '}' && s.peek() != '{') return false;
				if(c == ']' && s.peek() != '[') return false;
				s.pop();
			}
		}
		if(!s.empty()) return false;
		return true;
	}
}
