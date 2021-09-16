package com.suanfa.demo.sword_finger_offer;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/7 11:16 下午
 */
public class Offer63 {
    public static void main(String[] args) {
        int[] arr = {5,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        if (prices==null||prices.length==0) {
            return 0;
        }

        //历史股票最低点
        int minPrice = prices[0];
        int maxMoney = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<minPrice) {
                minPrice = prices[i];
            }

            maxMoney = Math.max(maxMoney, prices[i] - minPrice);
        }
        return maxMoney;
    }
}
