package com.myapp;

import java.util.LinkedList;
import java.util.Queue;

public class treci {

  static int[] dx = { -1, 0, 0, 1 };
  static int[] dy = { 0, -1, 1, 0 };

  public static int shortestPath(int[][] map) {

    int n = map.length;
    int m = map[0].length;

    if (map[0][0] == 1 || map[n - 1][m - 1] == 1)
      return -1;

    Queue<int[]> q = new LinkedList<>();
    boolean[][] visited = new boolean[n][m];

    q.add(new int[] { 0, 0, 0 }); // x, y, dist
    visited[0][0] = true;

    while (!q.isEmpty()) {

      int[] cur = q.poll();
      int x = cur[0];
      int y = cur[1];
      int dist = cur[2];

      // cilj
      if (x == n - 1 && y == m - 1)
        return dist;

      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && ny >= 0 && nx < n && ny < m) {

          if (!visited[nx][ny] && map[nx][ny] == 0) {
            visited[nx][ny] = true;
            q.add(new int[] { nx, ny, dist + 1 });
          }
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {

    int[][] map = {
        { 0, 0, 1 },
        { 1, 0, 1 },
        { 0, 0, 0 }
    };

    System.out.println(shortestPath(map));
  }
}
