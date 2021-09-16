package com.suanfa.demo.sword_finger_offer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.suanfa.demo.pojo.TreeNode;
import com.suanfa.demo.util.TreeBuilder;

/**
 * Description 剑指 Offer 32 - II. 从上到下打印二叉树 II
 * Create by 汪迎春
 * Date 2021/9/5 4:43 下午
 */
public class Offer32_2 {
    public static void main(String[] args) {
//        Integer[] arr = {3, 9, 20, null, null, 15, 7};
//        System.out.println(levelOrder(TreeBuilder.arrayToBTree(arr)));

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);


        for (int size = q1.size(); size > 0; size--) {
            System.out.println("======");
            System.out.println(size);
            q1.add(4);


        }

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root==null) {
            return list;
        }
        //存放待遍历的节点
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);
        while (!(q1.isEmpty() && q2.isEmpty())) {
            List<Integer> tmp1 = getValFromQueue(q1, q2);
            if (tmp1.size() != 0) {
                list.add(tmp1);
            }
            List<Integer> tmp2 = getValFromQueue(q2, q1);
            if (tmp2.size()!=0) {
                list.add(tmp2);
            }
        }
        return list;
    }

    private static List<Integer> getValFromQueue(Queue<TreeNode> q1, Queue<TreeNode> q2) {
        List<Integer> tmp = new LinkedList<>();
        while (!q1.isEmpty()) {
            TreeNode poll = q1.poll();
            if (poll!=null) {
                tmp.add(poll.val);
                q2.add(poll.left);
                q2.add(poll.right);
            }
        }
        return tmp;
    }



}
