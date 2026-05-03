package com.myapp;

import java.util.Stack;

public class Zad4 {

  public static void brackets(String s) {
    int len = s.length();
    int[] res = new int[len];
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < len; i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
        res[i] = 0; 
      } else {
        if (stack.empty()) {
          res[i] = -1;
        } else {
          int openIndex = stack.pop();
          res[openIndex] = 0;
          res[i] = 1;
        }
      }
    }

    while (!stack.empty()) {
      res[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < len; i++) {
      sb.append(res[i]);
    }

    System.out.println(sb.toString());
  }
}
