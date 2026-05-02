package com.myapp;

import java.util.Scanner;

public class Zad1 {
  static Scanner input = new Scanner(System.in);
  static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
  static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

  private int[][] createMat() {
    int n = input.nextInt();
    int[][] mat = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = input.nextInt();
      }
    }
    return mat;
  }

  private int[] findStart(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j] == 1)
          return new int[] { i, j };
      }
    }
    throw new IllegalArgumentException("Matrix does not have a starting position");
  }

  private boolean dfs(int[][] mat, boolean[][] visited, int x, int y) {

    // 1. granice
    if (x < 0 || y < 0 || x >= mat.length || y >= mat.length)
      return false;

    // 2. zid ili već posjećeno
    if (mat[x][y] == 0 || visited[x][y])
      return false;

    // 3. cilj
    if (mat[x][y] == 2)
      return true;

    // 4. označi
    visited[x][y] = true;

    // 5. idi u 8 smjerova
    for (int i = 0; i < 8; i++) {
      if (dfs(mat, visited, x + dx[i], y + dy[i]))
        return true;
    }

    // 6. nema puta
    return false;
  }

  public void existingPath() {
    int[][] mat = createMat();
    int[] start = findStart(mat);
    boolean[][] visited = new boolean[mat.length][mat.length];

    if (dfs(mat, visited, start[0], start[1]))
      System.out.println("Postoji put");
    else
      System.out.println("Ne postoji put");

  }
}
