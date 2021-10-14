package com.suanfa.demo.niuke;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/10/11 9:51 上午
 */
public class NC4 {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        if (head==null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && slow != null) {
            if (fast.next==null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
