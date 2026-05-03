package com.myapp;

public class Zad2 {

  static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
  static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

  private static int dfs(int[][] map, int x, int y, boolean[][] visited) {
    int m = map.length;
    int n = map[0].length;
    int size = 1;
    if (x < 0 || y < 0 || x >= m || y >= n)
      return 0;
    if (visited[x][y])
      return 0;
    if (map[x][y] == 1)
      return 0;
    else
      visited[x][y] = true;

    for (int i = 0; i < 8; i++) {
      size += dfs(map, x + dx[i], y + dy[i], visited);
    }
    return size;

  }

  public static void largestLake(int[][] map) {
    int m = map.length;
    int n = map[0].length;
    boolean[][] visited = new boolean[m][n];
    int max = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (visited[i][j] || map[i][j] == 1)
          continue;
        int size = dfs(map, i, j, visited);
        if (size > max)
          max = size;
      }
    }
    System.out.println("Najvece jezero zauzima " + max + " polja.");
  }

}
