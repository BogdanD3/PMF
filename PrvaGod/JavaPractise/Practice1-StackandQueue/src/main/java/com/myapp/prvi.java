package com.myapp;

import java.util.Scanner;

public class prvi {

  static Scanner input = new Scanner(System.in);

  private static int[][] makeMatrix(int n) {
    int[][] mat = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println("Unesite broj u matrici: ");
        mat[i][j] = input.nextInt();
      }
    }
    return mat;
  }

  private static int[] findStart(int[][] mat) {
    int n = mat.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 1)
          return new int[] { i, j };
      }
    }
    throw new IllegalArgumentException("Nema broja 1 u matrici");
  }

  private static boolean dfs(int[][] mat, boolean[][] visited, int x, int y) {
    int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
    int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

    if (x < 0 || y < 0 || y >= mat.length || x >= mat.length)
      return false;
    if (mat[x][y] == 0)
      return false;
    if (visited[x][y])
    return false;
    if (mat[x][y] == 2)
      return true;
    visited[x][y] = true;

    for (int i = 0; i < 8; i++) {
      if (dfs(mat, visited, x + dx[i], y + dy[i]))
        return true;
    }
    return false;
  }

  public static void path() {
    System.out.print("Unesite broj n: ");
    System.out.println();
    int n = input.nextInt();
    int[][] mat = makeMatrix(n);
    boolean[][] visited = new boolean[n][n];
    int[] start = findStart(mat);

    if (dfs(mat, visited, start[0], start[1])) {
      System.out.println("Postoji");
    } else {
      System.out.println("Ne postoji");
    }
  }

}
