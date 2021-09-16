package com.suanfa.demo.math;

import java.util.Stack;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description 旋转链表
 * Create by 汪迎春
 * Date 2021/7/26 10:42 下午
 */
public class Math61 {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        System.out.println(rotateRight(root, 2));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            stack.add(temp);
            temp = temp.next;
        }
        int num = k % len;
        ListNode first = stack.pop();
        ListNode preHead = head;
        for (int i = 0; i < num; i++) {
            ListNode node = stack.pop();
            node.next = null;
            first.next = preHead;
            preHead = first;
            first = node;
        }

        return preHead;
    }

}
