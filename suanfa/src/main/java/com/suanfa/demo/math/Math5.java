package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/6/24 7:15 下午
 */
public class Math5 {

    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int result = 0;
        if (s.length() == 0) {
            return result;
        }
        char negative = '-';
        char positive = '+';
        char firstChar = s.charAt(0);
        // 如果首字符不是数字并且不是+-符号
        if (!Character.isDigit(s.charAt(0)) && negative != firstChar && positive != firstChar) {
            return 0;
        }
        if ((firstChar == negative || firstChar == positive) && (s.length() == 1 || !Character.isDigit(s.charAt(1)))) {
            return 0;
        }
        // 如果首字符是-
        if (firstChar==negative) {
            for (int i = 1; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    break;
                }
                if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10
                        && s.charAt(i) > Math.abs(Integer.MIN_VALUE % 10))) {
                    return Integer.MIN_VALUE;
                }
                result = result * 10 - (s.charAt(i) - '0');
            }
            return result;
        }

        // 如果首字符是+ 或者数字
        if (firstChar==positive||Character.isDigit(firstChar)) {
            for (int i = 0; i < s.length(); i++) {
                if (i == 0 && firstChar == positive) {
                    continue;
                }
                if (!Character.isDigit(s.charAt(i))) {
                    break;
                }
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10
                        && (s.charAt(i)-'0') > Integer.MAX_VALUE % 10)) {
                    return Integer.MAX_VALUE;
                }

                result = result * 10 + (s.charAt(i)-'0');
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("2147483646"));
    }
}
