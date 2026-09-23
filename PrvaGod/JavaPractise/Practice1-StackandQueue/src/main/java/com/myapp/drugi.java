package com.myapp;

import java.util.LinkedList;
import java.util.Queue;

public class drugi {

    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static int bfs(int[][] map, boolean[][] visited, int sx, int sy) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy});
        visited[sx][sy] = true;

        int size = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            size++;

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 &&
                    nx < map.length && ny < map[0].length) {

                    if (!visited[nx][ny] && map[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }

        return size;
    }

    public static int najveceJezero(int[][] mapa) {

        int m = mapa.length;
        int n = mapa[0].length;

        boolean[][] visited = new boolean[m][n];
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (mapa[i][j] == 0 && !visited[i][j]) {
                    int size = bfs(mapa, visited, i, j);
                    if (size > max) {
                        max = size;
                    }
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] mapa = {
            {1, 0, 0, 1},
            {0, 0, 1, 1},
            {1, 0, 0, 0},
            {1, 1, 0, 1}
        };

        System.out.println("Najvece jezero je " + najveceJezero(mapa) + " nula.");
    }
}
