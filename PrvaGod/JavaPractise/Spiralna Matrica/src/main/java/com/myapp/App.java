package com.myapp;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Hello world!
 *
 */

public class App {

  static Scanner unos = new Scanner(System.in);

  public static int sumOfIndexes(int[][] matrix, int rows, int cols) {
    int sum = 0;
    for (int i = 1; i < rows; i += 2) {
      for (int j = 0; j < cols; j += 2) {
        sum += matrix[i][j];
      }
    }
    return sum;
  }

  public static int[][] RandMatrix() {

    int rows = unos.nextInt();
    int cols = unos.nextInt();
    int[][] matrix = new int[rows][cols];

    Random rand = new Random();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = rand.nextInt(100);
      }
    }
    return matrix;
  }

  public static boolean Symmetry(int[][] matrix, int rows, int cols) {
    if (rows != cols) return false;
    for (int i = 0; i < rows; i++) {
      for (int j = i + 1; j < cols; j++) {
        if (matrix[i][j] != matrix[j][i]) return false;
      }
    }
    return true;
  }

  public static int[][] rotateMatrix(int[][] matrix, int rows, int cols) {
    int[][] rotated = new int[cols][rows];

    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
       rotated[j][rows - 1 - i] = matrix[i][j];

    return rotated;
  }

  public static int[][] fillSpiral(int m, int n) {
    int[][] matrix = new int[m][n];
    int num = 1;

    int top = 0;
    int bottom = m - 1;
    int left = 0;
    int right = n - 1;

    while (top <= bottom && left <= right) {
      for (int j = left; j <= right; j++) {
         matrix[top][j] = num++;
      }
      top++;

      for (int i = top; i <= bottom; i++) {
          matrix[i][right] = num++;
      }
      right--;

      if (top <= bottom) {
         for (int j = right; j >= left; j--) {
           matrix[bottom][j] = num++;
         }
         bottom--;
      }

      if (left <= right) {
         for (int i = bottom; i >= top; i--) {
            matrix[i][left] = num++;
          }
          left++;
      }
    }

    return matrix;
  }


  public static void main(String[] args) {

    int[][] matrix = { { 1, 2, 3, 4, 5, }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
    int sum = sumOfIndexes(matrix, matrix.length, matrix[0].length);
    System.out.println(sum);
    System.out.println(Symmetry(matrix, matrix.length, matrix[0].length));
    System.out.println();
    
    int[][] randNumMatrix = RandMatrix();
    System.out.println(Arrays.deepToString(randNumMatrix));
    int[][] rotated = rotateMatrix(randNumMatrix, randNumMatrix.length, randNumMatrix[0]. length); 
    System.out.println(Arrays.deepToString(rotated));

    System.out.println("Unesite dimenzije za spiralnu matricu: ");
    int row = unos.nextInt();
    int col = unos.nextInt();
    int[][] spiralMatrix = fillSpiral(row, col);
    System.out.println(Arrays.deepToString(spiralMatrix));

  }
}
