package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 10- I. 斐波那契数列
 * Create by 汪迎春
 * Date 2021/9/7 9:52 上午
 */
public class Offer10 {
    public static void main(String[] args) {

    }

    public static int fib(int n) {
        if (n<=1) {
            return n;
        }

        int mod = 1000000007;
        // 动态数组
        int x = 0, y = 0, z = 1;
        for (int i = 2; i <= n; i++) {
            x = y;
            y = z;
            z = (x + y) % mod;
        }
        return z;
    }
}
