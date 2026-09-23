package com.myapp;

import java.util.Arrays;
import java.util.Stack;

public class Zad10 {

  public static void gold(int[] prices) {
    int len = prices.length;
    int[] res = new int[len];
    Stack<Integer> stack = new Stack<>();
    stack.push(0);

    for (int i = 1; i < len; i++) {
      if (prices[stack.peek()] > prices[i]) {
        stack.push(i);
      } else {
        while (!stack.empty() && prices[stack.peek()] < prices[i]) {
          res[stack.pop()] = i;
        }
        stack.push(i);
      }
    }
    while (!stack.empty()) {
      res[stack.pop()] = -1;
    }
    System.out.println(Arrays.toString(res));
  }

}
