package com.suanfa.demo.math;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/8 4:32 下午
 */
public class Math21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l1Next = new ListNode(2);
        l1.setNext(l1Next);
        l1Next.setNext(new ListNode(4));

        ListNode l2 = new ListNode(1);
        ListNode l2Next = new ListNode(3);
        l2.setNext(l2Next);
        l2Next.setNext(new ListNode(4));

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(mergeTwoLists(l1, l2));

    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode pre = root;

        while (l1 != null && l2 != null) {
            if (l1.getVal() <= l2.getVal()) {
                pre.setNext(l1);
                pre = l1;
                l1 = l1.getNext();
            } else {
                pre.setNext(l2);
                pre = l2;
                l2 = l2.getNext();
            }
        }

        ListNode lastNode = l1 == null ? l2 : l1;
        pre.setNext(lastNode);
        return root.getNext();
    }

}
