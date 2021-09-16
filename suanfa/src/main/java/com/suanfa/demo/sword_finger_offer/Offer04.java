package com.suanfa.demo.sword_finger_offer;

/**
 * Description 剑指 Offer 04. 二维数组中的查找
 * Create by 汪迎春
 * Date 2021/9/1 9:30 上午
 */
public class Offer04 {
    public static void main(String[] args) {
        int[][] arr = new int[1][1];
        arr[0] = new int[] {1};
//        arr[0] = new int[] {1, 4, 7, 11, 15};
//        arr[1] = new int[] {2, 5, 8, 12, 19};
//        arr[2] = new int[] {3, 6, 9, 16, 22};

        System.out.println(findNumberIn2DArray(arr, 1));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][m - 1]) {
                // 走二分
                boolean bool = binarySearch(matrix[i], target);
                if (bool) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] matrix, int target) {
        int len = matrix.length;
        int left = 0;
        int right = len - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (matrix[mid]==target) {
                return true;
            } else if (matrix[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
