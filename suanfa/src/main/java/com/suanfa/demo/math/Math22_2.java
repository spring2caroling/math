package com.suanfa.demo.math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description 广度优先遍历
 * Create by 汪迎春
 * Date 2021/7/11 8:38 下午
 */
public class Math22_2 {


    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n==0) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node("", n, n));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left == 0 && node.right == 0) {
                result.add(node.current);
            }
            if (node.left > 0) {
                queue.add(new Node(node.current + "(", node.left - 1, node.right));
            }
            if (node.right > 0 && node.left < node.right) {
                queue.add(new Node(node.current + ")", node.left, node.right - 1));
            }
        }
        return result;
    }


    static class Node {
        String current;
        int left;
        int right;

        public Node() {
        }

        public Node(String current, int left, int right) {
            this.current = current;
            this.left = left;
            this.right = right;
        }
    }


}

