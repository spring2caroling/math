package com.suanfa.demo.sword_finger_offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Description 剑指 Offer 50. 第一个只出现一次的字符
 * Create by 汪迎春
 * Date 2021/9/4 4:21 下午
 */
public class Offer50 {
    public static void main(String[] args) {


    }

    public static char firstUniqChar(String s) {
        if (s.length()==0) {
            return ' ';
        }
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (Character character : map.keySet()) {
            if (map.get(character)==1) {
                return character;
            }
        }

        return ' ';
    }

}
