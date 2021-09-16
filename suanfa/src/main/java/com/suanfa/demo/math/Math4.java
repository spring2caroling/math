package com.suanfa.demo.math;

/**
 * Description 整数反转
 * Create by 汪迎春
 * Date 2021/6/23 11:45 上午
 */
public class Math4 {

    private static int maxCount = 2147483647;

    public static int reverse(int x) {
        int tmp, result = 0;
        while (x != 0) {
            tmp = x % 10;
            // 最大边界问题处理
            if ((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10
                    && tmp > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            // 最小边界问题处理
            if ((result < Integer.MIN_VALUE / 10) || (result == Integer.MIN_VALUE / 10
                    && tmp < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            // 反转
            result = result * 10 + tmp;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(987654321));

    }

}
