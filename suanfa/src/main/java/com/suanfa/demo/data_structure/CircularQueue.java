package com.suanfa.demo.data_structure;

/**
 * Description 循环列表
 * Create by 汪迎春
 * Date 2021/8/2 10:12 上午
 */
public class CircularQueue {
    //元素数组
    private String[] items;
    //数组长度
    private int len;
    //头部指针
    private int head = 0;
    //尾部指针
    private int tail = 0;

    public CircularQueue(int capacity) {
        this.items = new String[capacity];
        this.len = capacity;
    }

    // 入队
    public boolean enQueue(String item) {
        //满队
        if ((tail + 1) % len == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % len;
        return true;
    }

    // 出队
    public String deQueue() {
        String result = null;
        // 队空
        if (tail == head) {
            return result;
        }
        result = items[head];
        head = (head + 1) % len;
        return result;
    }
}
