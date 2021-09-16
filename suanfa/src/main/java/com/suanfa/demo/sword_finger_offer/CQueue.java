package com.suanfa.demo.sword_finger_offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Description 剑指 Offer 09. 用两个栈实现队列
 * Create by 汪迎春
 * Date 2021/8/26 10:51 下午
 */
public class CQueue {

    private Deque<Integer> first = new LinkedList<>();

    private  Deque<Integer> second = new LinkedList<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        first.add(value);
    }

    public int deleteHead() {
        if (second.isEmpty()) {
            if (!first.isEmpty()) {
                while (!first.isEmpty()) {
                    second.add(first.pop());
                }
                return second.pop();
            }
            return -1;
        }
        return second.pop();
    }

    public static void main(String[] args) {
        CQueue queue = new CQueue();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);

        System.out.println(queue.deleteHead());
    }


}
