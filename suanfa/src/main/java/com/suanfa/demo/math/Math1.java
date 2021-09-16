package com.suanfa.demo.math;

import java.util.HashMap;
import java.util.Map;

/**
 * Description 不重复子字符串最大长度
 * Create by 汪迎春
 * Date 2021/6/19 10:39 上午
 */
public class Math1 {
    public static void main(String[] args) {
//                String s = "dvdf";
//        String s = "tmmzuxt";
                String s = "abba";
        System.out.println(test(s));
    }

    public static int test(String s) {
        int maxLen = 0;
        if (s == null || s.length() == 0) {
            return maxLen;
        }
        Map<Character, Integer> map = new HashMap<>();

        for (int start = 0, end = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)));
            }
            maxLen = Math.max(maxLen, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return maxLen;
    }

}
