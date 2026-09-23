package com.myapp;

import java.util.PriorityQueue;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {

    int[][] matrix = {
        { 5, 3, 4 },
        { 6, 2, 9 },
        { 1, 7, 8 }
    };

    int k = 3;

    int[] result = FirstProblem.kRichest(matrix, k);

    for (int val : result) {
      System.out.print(val + " ");
    }

    SecondProblem.main(new String[0]);
    ThirdProblem.main(new String[0]);
    FourthProblem.main(new String[0]);
    FifthProblem.main(new String[0]);
    SixthProblem.main("ProGraMiraNje");
  }
}
