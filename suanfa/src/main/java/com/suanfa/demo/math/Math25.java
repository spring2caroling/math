package com.suanfa.demo.math;

import java.util.LinkedList;
import java.util.Queue;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/13 2:07 下午
 */
public class Math25 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
//        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
//        l5.next = l6;
        System.out.println(reverseKGroup(l1, 2));


    }


    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head==null) {
            return null;
        }
        if (k==1) {
            return head;
        }

        ListNode root = null;
        // 反转后的头和尾部
        ListNode reverFirst = null;
        ListNode reverTail = head;
        Queue<ListNode> queue = new LinkedList<>();
        int loop = 0;

        while (true) {
            int count = 0;
            // 反转前的首个
            ListNode fisrt = null;
            // 反转前的尾部
            ListNode tail = null;
            // 临时节点
            ListNode temp = head;
            if (loop==0) {
                reverFirst = head;
            }
            while (temp != null && count < k) {
                if (count==0) {
                    fisrt = temp;
                }
                if (count==k-1) {
                    tail = temp;
                }
                queue.add(temp);
                temp = temp.next;
                count++;
            }
            //记录反转后的头节点
            if (loop==0) {
                root = tail;
            }

            ListNode pre = reverTail;
            int num = 0;
            if (temp == null && count < k) {
                reverTail.next = fisrt;
                break;
            }

            // 开始反转
            while (!queue.isEmpty()) {
                ListNode poll = queue.poll();
                // 记录反转后头和尾部
                if (num==0) {
                    reverTail.next = reverFirst;
                    reverFirst = poll;
                }
                if (num==k-1) {
                    reverTail = poll;
                }
                if (poll==root) {
                    pre = poll;
                    continue;
                }
                pre.next = poll;
                pre = poll;
                num++;
            }
            loop++;
        }
        return root;

    }
}
