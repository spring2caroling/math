package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/24 9:33 下午
 */
public class Math50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, -3));
//        System.out.println(Integer.MAX_VALUE);
    }

    public static double myPow(double x, int n) {
        if (n==0) {
            return 1;
        }
        return n > 0 ? calcul(x, n) : 1.0 / calcul(x, -n);
    }

    private static double calcul(double x, int n) {
        if (n==0) {
            return 1.0;
        }
        double num = calcul(x, n / 2);
        return n % 2 == 0 ? num * num : num * num * x;
    }

}
