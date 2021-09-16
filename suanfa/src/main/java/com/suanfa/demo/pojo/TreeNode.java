package com.suanfa.demo.pojo;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/4 4:54 下午
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) {
        val = x;
    }

    public TreeNode() {

    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
