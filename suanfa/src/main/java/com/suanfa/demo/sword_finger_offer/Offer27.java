package com.suanfa.demo.sword_finger_offer;

import com.suanfa.demo.pojo.TreeNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/6 8:59 上午
 */
public class Offer27 {
    public static void main(String[] args) {


    }

    public static TreeNode mirrorTree(TreeNode root) {
        if (root==null||(root.left==null&&root.right==null)) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }


}
