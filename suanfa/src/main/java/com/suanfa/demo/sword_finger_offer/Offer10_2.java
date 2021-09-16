package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 10- II. 青蛙跳台阶问题
 * Create by 汪迎春
 * Date 2021/9/7 11:02 下午
 */
public class Offer10_2 {
    public static void main(String[] args) {

    }

    public static int numWays(int n) {
        if (n<=2) {
            return n;
        }

        int mod = 1000000007;
        int x = 0, y = 0, z = 3;

        for (int i = 3; i <= n; i++) {
            x = y;
            y = z;
            z = (x + y) % mod;
        }
        return z;
    }
}
