package com.suanfa.demo.sword_finger_offer;

import com.suanfa.demo.pojo.TreeNode;

import jdk.nashorn.internal.ir.IfNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/6 10:49 下午
 */
public class Offer28 {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        if ((root == null) || (root.left == null && root.right == null)) {
            return true;
        }
        return checkEqual(root.left, root.right);
    }

    private static boolean checkEqual(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null && right != null) {
            return false;
        }
        if (left != null && right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return checkEqual(left.left, right.right) && checkEqual(left.right, right.left);
    }
}
