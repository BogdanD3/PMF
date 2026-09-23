package com.myapp;

import java.util.LinkedList;
import java.util.Queue;

public class binaryDeviders {

  	public static int deviders(int n) {
		Queue<Integer> red = new LinkedList<Integer>();
		red.offer(1);
		
		while(red.peek() % n != 0) {
			int broj = red.poll();
			int broj1 = broj*10;
			int broj2 = broj*10 + 1;
			red.offer(broj1);
			red.offer(broj2);
		}
		
		return red.peek();  
  }
}
