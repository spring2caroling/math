package com.suanfa.demo.data_structure;

/**
 * Description 此类是二分查找法的载体，里面会包含多种二分查找法的变形
 * Create by 汪迎春
 * Date 2021/8/17 8:33 下午
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
//        System.out.println(findFirst(arr, 8));
//        System.out.println(findLast(arr, 8));
//        System.out.println(findFirstBigAndEqual(arr, 6));
        System.out.println(findLastLittleEqual(arr, 9));

    }

    /**
     * 找到第一个等于num的下标
     * @param arr
     * @param num
     * @return
     */
    public static int findFirst(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                // 如果mid是0位元素，肯定是，如果mid前一个不等于num,这个mid也是，否则num肯定在low->mid-1
                if (mid == 0 || arr[mid - 1] != num) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找最后一个等于num的值
     * @param arr
     * @param num
     * @return
     */
    public static int findLast(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != num) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找第一个大于等于给定值的元素下标
     * @param arr
     * @param num
     * @return
     */
    public static int findFirstBigAndEqual(int[] arr, int num) {
        int low = 0;
        int len = arr.length;
        int high = len - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] >= num) {
                if (arr[mid] == 0 || arr[mid - 1] < num) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 查找最后一个小于等于某个值的下标
     * @param arr
     * @param num
     * @return
     */
    public static int findLastLittleEqual(int[] arr, int num) {
        int low = 0;
        int len = arr.length;
        int high = len - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] <= num) {
                if (mid == len - 1 || arr[mid + 1] > num) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = low - 1;
            }
        }
        return -1;
    }

}
