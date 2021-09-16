package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 47. 礼物的最大价值
 * <p>
 *     这个需要原地修改数组，所以，就用原数组作为存放最值的结果
 * </p>
 * Create by 汪迎春
 * Date 2021/9/12 3:51 下午
 */
public class Offer47 {
    public static void main(String[] args) {

    }

    public static int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //第一行
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        //第一列
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
