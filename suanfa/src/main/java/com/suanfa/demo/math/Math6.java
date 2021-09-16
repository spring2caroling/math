package com.suanfa.demo.math;


/**
 * Description
 * Create by 汪迎春
 * Date 2021/6/28 8:16 下午
 */
public class Math6 {


    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
      // 边界，负数、10的倍数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverseNumber = 0;

        while (x > reverseNumber) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }
        return x == reverseNumber || x == reverseNumber / 10;
    }
}
