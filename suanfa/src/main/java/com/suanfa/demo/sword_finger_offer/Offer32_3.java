package com.suanfa.demo.sword_finger_offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.suanfa.demo.pojo.TreeNode;
import com.suanfa.demo.util.TreeBuilder;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/5 5:30 下午
 */
public class Offer32_3 {
    public static void main(String[] args) {
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = TreeBuilder.arrayToBTree(arr);

        System.out.println(levelOrder(treeNode));

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root==null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int count = 0;
        while (!queue.isEmpty()) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int size = queue.size(); size > 0; size--) {
                TreeNode poll = queue.poll();
                if (count % 2 == 0) {
                    linkedList.addLast(poll.val);
                } else {
                    linkedList.addFirst(poll.val);
                }
                if (poll.left!=null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            list.add(linkedList);
            count++;
        }
        return list;
    }
}
