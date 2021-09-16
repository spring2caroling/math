package com.suanfa.demo.sword_finger_offer;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/8/27 9:29 上午
 */
public class MinStack {

    // 正常存放元素
    private Deque<Integer> first;
    // 存放最小值系列元素
    private Deque<Integer> second;


    public MinStack() {
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x) {
        first.push(x);
        if (second.isEmpty()||second.peek()>=x) {
            second.push(x);
        }
    }

    public void pop() {
        if (!first.isEmpty()) {
            if (first.peek().equals(second.peek())) {
                second.pop();
            }
            first.pop();
        }
    }

    public int top() {
        return first.peek();
    }

    public int min() {
        return second.peek();
    }
}
