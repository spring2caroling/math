package com.suanfa.demo.niuke;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description NC78 反转链表
 * Create by 汪迎春
 * Date 2021/9/26 9:40 下午
 */
public class NC78 {
    public static void main(String[] args) {

    }

    public static ListNode ReverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        return pre;
    }
}
