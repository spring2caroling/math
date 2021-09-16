package com.suanfa.demo.math;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/5 11:33 上午
 */
public class Math10 {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {
        Map<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('I', 1);
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);
        valueMap.put('D', 500);
        valueMap.put('M', 1000);

        int result = 0;
        int pre = 0;
        int temp;

        for (int i = 0; i < s.length(); i++) {
            temp = valueMap.get(s.charAt(i));
            // 上一个比本次小
            if (pre < temp) {
                result += (temp - 2 * pre);
            } else {
                result += temp;
            }
            pre = temp;
        }

        return result;
    }

}
