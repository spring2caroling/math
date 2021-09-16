package com.suanfa.demo.math;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description 动态规划
 * Create by 汪迎春
 * Date 2021/7/11 9:39 下午
 */
public class Math23 {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        ListNode l11 = new ListNode(4, new ListNode(5));
//        l1.setNext(l11);
//
//        ListNode l2 = new ListNode(1);
//        ListNode l22 = new ListNode(3, new ListNode(4));
//        l2.setNext(l22);
//
//        ListNode l3 = new ListNode(2);
//        ListNode l33 = new ListNode(6);
//        l3.setNext(l33);
//
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(l3);
//
//        ListNode[] lists = new ListNode[3];
//        lists[0] = l1;
//        lists[1] = l2;
//        lists[2] = l3;
//
//        System.out.println(mergeKLists(lists));
//        [[],[1]]


        ListNode[] lists = new ListNode[2];
        lists[0] = null;
        lists[1] = new ListNode(1);


        System.out.println(mergeKLists(lists));
        /**
         * <p>
         *     此题还可以利用纵向比较每个链表的head
         *     1，2，3，4
         *     2，4，6，9
         *     1，5，6
         *
         *     先取纵向取1，2，1
         * </p>
         */

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        Stack<Integer> stack = new Stack<>();
        if (lists==null||lists.length==0) {
            return null;
        }
        int len = lists.length;
        ListNode[] temp = new ListNode[len];
        // 边界条件
        temp[0] = lists[0];

        if (len>=2) {
            for (int i = 1; i < len; i++) {
                temp[i] = mergeTwo(lists, temp, i);
            }
        }

        return temp[len - 1];
    }

    private static ListNode mergeTwo(ListNode[] lists, ListNode[] temp, int i) {
        ListNode l1 = temp[i - 1];
        ListNode l2 = lists[i];

        ListNode root = new ListNode(-1);
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
        pre.setNext(l1 == null ? l2 : l1);

        return root.getNext();
    }


}
