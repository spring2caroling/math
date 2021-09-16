package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/2 10:03 上午
 */
public class Math7 {
    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*p*.";
        System.out.println(isMatch(s, p));
    }


    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // +1 是表示这个矩阵中有表示空字符串的位置
        boolean[][] matchArrLog = new boolean[m + 1][n + 1];
        // 边界条件
        matchArrLog[0][0] = true;
        for (int i = 0; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // p最后一个不是*
                if (p.charAt(j - 1) != '*') {
                    if (match(s, p, i, j)) {
                        matchArrLog[i][j] = matchArrLog[i - 1][j - 1];
                    }
                } else {
                    // 匹配1次或者多次
                    if (match(s, p, i, j - 1)) {
                        matchArrLog[i][j] = (matchArrLog[i - 1][j] || matchArrLog[i][j - 2]);
                    } else {
                        // 匹配0次
                        matchArrLog[i][j] = matchArrLog[i][j - 2];
                    }
                }
            }
        }
        return matchArrLog[m][n];
    }

    // i,j为0
    public static boolean match(String s, String p, int i, int j) {
        if (i == 0 && j == 0) {
            return true;
        }
        if (i == 0 || j == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }


}
