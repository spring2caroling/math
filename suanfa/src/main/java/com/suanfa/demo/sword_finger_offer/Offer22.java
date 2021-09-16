package com.suanfa.demo.sword_finger_offer;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description 剑指 Offer 22. 链表中倒数第k个节点
 * Create by 汪迎春
 * Date 2021/9/15 9:33 上午
 */
public class Offer22 {
    public static void main(String[] args) {

    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
