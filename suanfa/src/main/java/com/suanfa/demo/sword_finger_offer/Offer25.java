package com.suanfa.demo.sword_finger_offer;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description 剑指 Offer 25. 合并两个排序的链表
 * Create by 汪迎春
 * Date 2021/9/16 9:34 上午
 */
public class Offer25 {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        temp.next = l1 == null ? l2 : l1;
        return head.next;
    }

}
