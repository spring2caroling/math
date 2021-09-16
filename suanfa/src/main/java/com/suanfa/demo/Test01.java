package com.suanfa.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

import com.suanfa.demo.pojo.ListNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/7/2 5:21 下午
 */
public class Test01 {
    public static void main(String[] args) {
//        System.out.println(7 / -3);
//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
//        //        ListNode l6 = new ListNode(6);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        //        l5.next = l6;
//
//        System.out.println(Arrays.toString(myReverse(l1, l5)));

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1, 10);
        treeMap.put(2, 20);
        treeMap.put(3, 30);
        System.out.println(treeMap.floorKey(4));

    }


    public static ListNode[] myReverse(ListNode head, ListNode tail) {
        Queue<ListNode> queue = new LinkedList<>();
        ListNode next = head;
        while (next != tail) {
            ListNode addNode = next;
            addNode.next = null;
            queue.add(addNode);
            next = next.next;
        }

        ListNode pre = tail;
        while (!queue.isEmpty()) {
            ListNode poll = queue.poll();
            pre.next = poll;
            pre = poll;
        }
        return new ListNode[] {tail, head};
    }
}
