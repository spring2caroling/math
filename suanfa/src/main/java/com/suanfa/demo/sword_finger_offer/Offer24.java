package com.suanfa.demo.sword_finger_offer;

import java.util.Deque;
import java.util.LinkedList;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/8/29 4:26 下午
 */
public class Offer24 {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

                System.out.println(reverseList(root));

    }


    /**
     * 双指针
     */
//    public ListNode reverseList(ListNode head) {
//        ListNode current = head;
//        ListNode pre = null;
//
//        while (current != null) {
//            ListNode tmp = current.next;
//            current.next = pre;
//            pre = current;
//            current = tmp;
//        }
//        return pre;
//    }

    /**
     * 递归
     */
    public static ListNode reverseList(ListNode head) {
        return rec(head, null);
    }

    private static ListNode rec(ListNode current, ListNode pre) {
        if (current==null) {
            return pre;
        }

        ListNode res = rec(current.next, current);

        current.next = pre;

        return res;
    }


}