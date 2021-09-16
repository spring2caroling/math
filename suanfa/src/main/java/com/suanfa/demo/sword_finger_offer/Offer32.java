package com.suanfa.demo.sword_finger_offer;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.suanfa.demo.pojo.TreeNode;
import com.suanfa.demo.util.TreeBuilder;

/**
 * Description 剑指 Offer 32 - I. 从上到下打印二叉树
 * Create by 汪迎春
 * Date 2021/9/4 4:52 下午
 */
public class Offer32 {
    public static void main(String[] args) {
        Integer[] arr = {3, 9, 20, null, null, 15, 7};

        System.out.println(Arrays.toString(levelOrder(TreeBuilder.arrayToBTree(arr))));

    }

    public static int[] levelOrder(TreeNode root) {
        if (root==null) {
            return new int[0];
        }

        //存放遍历出来的元素
        List<Integer> list = new LinkedList<>();
        //存放待遍历的节点
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(root);

        while (!(q1.isEmpty() && q2.isEmpty())) {
            while (!q1.isEmpty()) {
                addNode(q1, q2, list);
            }

            while (!q2.isEmpty()) {
                addNode(q2, q1, list);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private static void addNode(Queue<TreeNode> q1, Queue<TreeNode> q2, List<Integer> list) {
        TreeNode poll = q1.poll();
        if (poll != null) {
            list.add(poll.val);
            q2.add(poll.left);
            q2.add(poll.right);
        }
    }

}
