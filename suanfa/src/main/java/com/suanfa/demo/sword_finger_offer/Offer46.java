package com.suanfa.demo.sword_finger_offer;

/**
 * Description  剑指 Offer 46. 把数字翻译成字符串
 * Create by 汪迎春
 * Date 2021/9/12 5:15 下午
 */
public class Offer46 {
    public static void main(String[] args) {
        System.out.println(translateNum(12258));
    }

    /**
     * <p>
     *     转化方程：
     *     f(i) = f(i-1) + f(i-2) ( x in 10,25)
     *     类似于上台阶的题目
     *
     *      同时空间利用率优化，利用滚动数组
     * </p>
     */
    public static int translateNum(int num) {
        String numStr = String.valueOf(num);

        int x = 0, y = 0, z = 1;
        for (int i = 0; i < numStr.length(); i++) {
            x = y;
            y = z;
            z = 0;
            z += y;
            if (i==0) {
                continue;
            }

            // 截取当前位和前一位 记得是左闭右开的
            String str = numStr.substring(i - 1, i + 1);

            if (str.compareTo("25")<=0&&str.compareTo("10")>=0) {
                z += x;
            }
        }
        return z;
    }
}
