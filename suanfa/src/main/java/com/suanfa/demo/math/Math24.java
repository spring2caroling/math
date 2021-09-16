package com.suanfa.demo.math;

import java.util.LinkedList;
import java.util.Queue;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description 两辆交换链表中的节点
 * Create by 汪迎春
 * Date 2021/7/12 10:24 下午
 */
public class Math24 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//
//        ListNode l5 = new ListNode(5);
//        ListNode l6 = new ListNode(6);
//
//
//
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        l5.next = l6;

        System.out.println(l1);

        System.out.println(swapPairs(l1));

    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode root = head.next;
        ListNode pre = null;

        Queue<ListNode> queue = new LinkedList<>();
        queue.offer(head);

        while (!queue.isEmpty()) {
            // 1
            ListNode first = queue.poll();
            // 2
            ListNode second = first.next;
            if (second==null) {
                break;
            }
            // 3
            ListNode nextNode = second.next;
            // 1->3
            first.next = nextNode;
            // 2->1
            second.next = first;

            if (pre!=null) {
                pre.next = second;
                pre = first;
            }else {
                pre = first;
            }

            if (nextNode!=null) {
                queue.offer(nextNode);
            }
        }
        return root;
    }
}
