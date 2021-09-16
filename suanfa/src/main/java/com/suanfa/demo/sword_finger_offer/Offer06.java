package com.suanfa.demo.sword_finger_offer;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description 剑指 Offer 06. 从尾到头打印链表
 * Create by 汪迎春
 * Date 2021/8/29 4:03 下午
 */
public class Offer06 {
    public static void main(String[] args) {

    }



    public int[] reversePrint(ListNode head) {
        if (head==null) {
            return new int[0];
        }

        int count = 0;
        ListNode node = head;
        while (node!= null) {
            count++;
            node = node.next;
        }

        ListNode temp = head;
        int[] arr = new int[count];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i]= temp.val;
            temp = temp.next;
        }
        return arr;
    }
}
