package com.myapp;

import java.util.Scanner;

public class Zad12 {

  static class Node {
    Integer val;
    Node next;

    public Node(int val) {
      this.val = val;
      this.next = null;
    }
  }

  static class sorted {
    Node head;

    public void addToSorted(int n) {
      Node k = new Node(n);
      if (head == null || n < head.val) {
        k.next = head;
        head = k;
        return;
      }
      Node curr = head;
      while (curr.next != null && curr.next.val < n) {
        curr = curr.next;
      }
      k.next = curr.next;
      curr.next = k;
    }

    public float getEvenMedian(int mid) {
      Node curr = head;
      int i = 0;
      while (i < (mid / 2) - 1) {
        curr = curr.next;
        i++;
      }
      return (float) (curr.val + curr.next.val) / 2;
    }

    public float getOddMedian(int mid) {
      int i = 0;
      Node curr = head;
      while (i < mid / 2) {
        curr = curr.next;
        i++;
      }
      return curr.val;
    }
  }

  static Scanner input = new Scanner(System.in);

  public static void mids() {
    sorted sl = new sorted();
    int counter = 0;
    while (true) {
      System.out.println("Unesite broj: ");
      char n = input.next().charAt(0);
      if (n == '0')
        return;

      if (n != 'M') {
        counter++;
        sl.addToSorted(n - '0');
      } else {
        if (counter % 2 == 0) {
          System.out.print(sl.getEvenMedian(counter) + " ");
        } else
          System.out.print(sl.getOddMedian(counter) + " ");
      }
    }
  }

}
