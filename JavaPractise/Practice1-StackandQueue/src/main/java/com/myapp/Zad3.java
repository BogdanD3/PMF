package com.myapp;

import java.util.Arrays;
import java.util.Stack;

public class Zad3 {

  public static void biggestRight(int[] arr) {
    int len = arr.length;
    int[] result = new int[len];
    if (len == 0 || len == 1) {
      System.out.println("-1");
      return;
    }
    Stack<Integer> stack = new Stack<>();
    stack.push(0);

    for (int i = 1; i < len; i++) {
      while (!stack.empty() && arr[stack.peek()] < arr[i]) {
        result[stack.pop()] = arr[i];
      }

      stack.push(i);
    }
    while (!stack.empty()) {
      result[stack.peek()] = -1;
      stack.pop();
    }

    System.out.println(Arrays.toString(result));
  }

}
