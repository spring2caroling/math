package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/17 5:44 下午
 */
public class Math29 {

    public static void main(String[] args) {
        System.out.println(divide(Integer.MAX_VALUE, -2));
//        System.out.println(divide(-7, -2));
    }


    public static int divide(int dividend, int divisor) {
        // 被除数为0
        if (dividend==0) {
            return 0;
        }
        // 除数为1
        if (divisor==1) {
            return dividend;
        }
        // 除数为-1
        if (divisor == -1) {
            if (dividend > Integer.MIN_VALUE) {
                return -dividend;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        long a = dividend;
        long b = divisor;
        int result = calcul(Math.abs(a), Math.abs(b));

        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            return result;
        } else {
            return -result;
        }

    }

    private static int calcul(long dividend, long divisor) {
        int result = 0;
        if (divisor > dividend) {
            return result;
        }
        long originDivsior = divisor;
        result = 1;

        long pre = divisor;
        while (true) {
            if (divisor + divisor < dividend) {
                divisor += divisor;
                result += result;
                pre = divisor;
            } else {
                break;
            }
        }
        result += calcul(dividend - pre, originDivsior);
        return result;
    }
}
