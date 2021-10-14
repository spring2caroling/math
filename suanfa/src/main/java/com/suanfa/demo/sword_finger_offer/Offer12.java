package com.suanfa.demo.sword_finger_offer;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/24 11:30 下午
 */
public class Offer12 {
    public static void main(String[] args) {

    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] wordCharArr = word.toCharArray();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, wordCharArr, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, char[] wordCharArr, int i, int j, int k) {
        // 判断逻辑
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != wordCharArr[k]) {
            return false;
        }
        // 边界条件
        if (k == wordCharArr.length - 1) {
            return true;
        }
        //防止一个元素重复利用
        board[i][j] = '\0';
        // 递归
        boolean result =
                dfs(board, wordCharArr, i + 1, j, k + 1) || dfs(board, wordCharArr, i, j + 1, k + 1) || dfs(board,
                        wordCharArr, i - 1, j, k + 1) || dfs(board, wordCharArr, i, j - 1, k + 1);
        board[i][j] = wordCharArr[k];
        return result;
    }
}
