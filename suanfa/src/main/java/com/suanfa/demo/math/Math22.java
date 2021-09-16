package com.suanfa.demo.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 括号生成
 * Create by 汪迎春
 * Date 2021/7/11 11:38 上午
 */
public class Math22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(new char[2 * n], 0, list);
        return list;
    }

    private static void generate(char[] chars, int i, List<String> list) {
        // 边界
        if (i == chars.length) {
            if (checkVaild(chars)) {
                list.add(new String(chars));
            }
        } else {
            chars[i] = '(';
            generate(chars, i + 1, list);
            chars[i] = ')';
            generate(chars, i + 1, list);
        }
    }

    private static boolean checkVaild(char[] chars) {
        int count = 0;
        for (char aChar : chars) {
            if (aChar == '(') {
                count++;
            } else {
                count--;
            }
            // 数组左边右括号的数量大于左括号的数量，肯定不能成有效括号
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }


}


