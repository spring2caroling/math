package com.suanfa.demo.sword_finger_offer;

import com.suanfa.demo.pojo.TreeNode;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/9/5 10:40 下午
 */
public class Offer26 {
    public static void main(String[] args) {

    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A==null||B==null) {
            return false;
        }
        return (check(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private static boolean check(TreeNode a, TreeNode b) {
        if (b==null) {
            return true;
        }
        if (a == null || a.val != b.val) {
            return false;
        }
        return check(a.left, b.left) && check(a.right, b.right);
    }
}
