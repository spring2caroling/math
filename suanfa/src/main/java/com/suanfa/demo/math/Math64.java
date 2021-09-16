package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/30 10:59 上午
 */
public class Math64 {
    public static void main(String[] args) {
        int[][] grid = {};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int now = grid[i][j];
                if (i == 0 && j == 0) {
                    dp[i][j] = now;
                }
                if (i == 0 && j > 0) {
                    dp[0][j] = dp[0][j - 1] + now;
                }
                if (i > 0 && j == 0) {
                    dp[i][0] = dp[i - 1][0] + now;
                }
                if (i > 0 && j > 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + now;
                }
            }
        }
        return dp[m - 1][n - 1];
    }


}
