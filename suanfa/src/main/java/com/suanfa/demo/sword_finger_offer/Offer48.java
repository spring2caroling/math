package com.suanfa.demo.sword_finger_offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Description 剑指 Offer 48. 最长不含重复字符的子字符串
 * Create by 汪迎春
 * Date 2021/9/14 9:59 上午
 */
public class Offer48 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }


    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0, start = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(map.get(s.charAt(i)), start);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - start);
        }
        return res;
    }

}
