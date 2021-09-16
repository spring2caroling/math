package com.suanfa.demo.sword_finger_offer;

import java.util.TreeMap;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description 剑指 Offer 18. 删除链表的节点
 * Create by 汪迎春
 * Date 2021/9/14 11:12 下午
 */
public class Offer18 {
    public static void main(String[] args) {
    }

    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val ==val) {
            return head.next;
        }
        ListNode pre = null;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val==val) {
                pre.next = temp.next;
                break;
            }
            pre = temp;
            temp = temp.next;
        }
        return head;
    }

}
