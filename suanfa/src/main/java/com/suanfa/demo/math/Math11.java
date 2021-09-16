package com.suanfa.demo.math;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/5 4:14 下午
 */
public class Math11 {
    public static void main(String[] args) {
        String[] str =null;
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0) {
            return "";
        }
        int minLen = strs[0].length();
        int minCount = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLen) {
                minCount = i;
                minLen = strs[i].length();
            }
        }

        String commonPrefix = strs[minCount];
        for (String str : strs) {
            if (commonPrefix==null||commonPrefix.length()==0) {
                return "";
            }
            if (!str.startsWith(commonPrefix)) {
                while (!commonPrefix.equals("")) {
                    commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                    if (commonPrefix.equals("")) {
                        return "";
                    }
                    if (str.startsWith(commonPrefix)) {
                        break;
                    }
                }
            }
        }
        return commonPrefix;
    }
}
