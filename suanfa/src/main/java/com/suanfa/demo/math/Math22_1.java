package com.suanfa.demo.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 括号生成 深度遍历
 * Create by 汪迎春
 * Date 2021/7/11 4:54 下午
 */
public class Math22_1 {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list, "", n, n);
        return list;
    }

    private static void generate(List<String> list, String current, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(current);
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            generate(list, current + "(", left - 1, right);
        }
        if (right > 0) {
            generate(list, current + "(", left, right);
        }
    }
}
