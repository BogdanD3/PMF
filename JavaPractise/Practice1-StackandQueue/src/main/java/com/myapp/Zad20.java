package com.myapp;

import java.util.*;

public class Zad20 {
  public static int[] parse(String pos) {
    int x = pos.charAt(0) - 'A';
    int y = pos.charAt(1) - '1';
    return new int[] { x, y };
  }

  private static void fillHorses(Set<String> blocked, int[][] knights) {
    int[] dx = { 2, 2, -2, -2, 1, 1, -1, -1 };
    int[] dy = { 1, -1, 1, -1, 2, -2, 2, -2 };

    for (int[] k : knights) {
      int x = k[0];
      int y = k[1];

      blocked.add(x + "," + y);

      for (int i = 0; i < 8; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
          blocked.add(nx + "," + ny);
        }
      }
    }
  }

  private static int bfs(int sx, int sy, Set<String> blocked) {

    int[] dx = { -1, -1, 1, 1 };
    int[] dy = { -1, 1, -1, 1 };

    Queue<int[]> q = new LinkedList<>();
    boolean[][] visited = new boolean[8][8];

    q.add(new int[] { sx, sy, 0 });
    visited[sx][sy] = true;

    while (!q.isEmpty()) {

      int[] cur = q.poll();
      int x = cur[0];
      int y = cur[1];
      int dist = cur[2];

      if (y == 7) {
        return dist;
      }

      for (int dir = 0; dir < 4; dir++) {

        int nx = x;
        int ny = y;

        while (true) {

          nx += dx[dir];
          ny += dy[dir];

          if (nx < 0 || nx >= 8 || ny < 0 || ny >= 8)
            break;

          if (blocked.contains(nx + "," + ny))
            break;

          if (visited[nx][ny])
            break;

          visited[nx][ny] = true;
          q.add(new int[] { nx, ny, dist + 1 });
        }
      }
    }

    return Integer.MAX_VALUE;
  }

  public static void solve(int n, int[][] knights) {
    Set<String> blocked = new HashSet<>();

    Zad20.fillHorses(blocked, knights);
    int c1 = bfs(0, 0, blocked); // C1
    int f1 = bfs(5, 0, blocked); // F1

    if (c1 < f1)
      System.out.println("Prvi");
    else if (f1 < c1)
      System.out.println("Drugi");
    else
      System.out.println("Nerijeseno");
  }

}
