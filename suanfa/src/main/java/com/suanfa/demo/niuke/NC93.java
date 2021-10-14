package com.suanfa.demo.niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/26 9:54 下午
 */
public class NC93 {
    public static void main(String[] args) {
//        int[][] oper = {{1, 1, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};
        int[][] oper = {{1,1,1},{1,2,2},{2,1},{1,3,3},{2,2},{1,4,4},{2,1},{2,3},{2,4}};
        int k = 2;
        System.out.println(Arrays.toString(LRU(oper, k)));
    }

    private static Map<Integer, Node> cache = new HashMap<>();
    // 这里固定头部和尾部，方便计算使用
    private static Node head = new Node(-1, -1);
    private static Node tail = new Node(-1, -1);
    private static int size = 0 ;

    public static int[] LRU (int[][] operators, int k) {
        size = k;
        head.next = tail;
        tail.pre = head;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < operators.length; i++) {
            if (operators[i][0] == 1) {
                set(operators[i][1], operators[i][2]);
            } else {
                list.add(get(operators[i][1]));
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


    public static void set(int key,int val){
        if (get(key) > -1) {
            cache.get(key).val = val;
        } else {
            if (cache.size()==size) {
                int tailkey = tail.pre.key;
                tail.pre.pre.next = tail;
                tail.pre = tail.pre.pre;
                cache.remove(tailkey);
            }
            Node node = new Node(key, val);
            moveToHead(node);
            cache.put(key, node);
        }
    }

    private static void moveToHead(Node node) {
        head.next.pre = node;
        node.next = head.next;
        head.next = node;
        node.pre = head;
    }


    public static int get(int key){
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            // 先删除再挪到头部
            node.pre.next = node.next;
            node.next.pre = node.pre;
            moveToHead(node);
            return node.val;
        }
        return -1;
    }


    static class Node{
        Node pre;
        Node next;
        int val;
        int key;

        Node(){}

        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

}
