package com.myapp;
import java.util.PriorityQueue;

public class FirstProblem {

    public static int[] kRichest(int[][] matrix, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int[] row : matrix) {
            for (int val : row) {

                minHeap.offer(val);

                if (minHeap.size() > k) {
                    minHeap.poll(); // remove smallest
                }
            }
        }

        int[] result = new int[k];
        int i = 0;

        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }

        return result;
    }
}
