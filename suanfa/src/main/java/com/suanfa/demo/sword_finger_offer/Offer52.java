package com.suanfa.demo.sword_finger_offer;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/16 9:54 上午
 */
public class Offer52 {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != temp2) {
            temp1 = temp1 == null ? temp2 : temp1.next;
            temp2 = temp2 == null ? temp1 : temp2.next;
        }
        return temp1;
    }
}
