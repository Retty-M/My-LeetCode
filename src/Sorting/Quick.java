package Sorting;

import java.util.Stack;

/**
 * Created by Retty on 2016-04-03.
 * 快速排序：选择一个基准，进行一次排序使得左边的数都小于基准数
 * 右边的数都大于基准数，然后对左右两边进行递归调用
 */
public class Quick {

    // 递归算法
    public static int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (left < right && nums[right] >= pivot) right--;
            if (left < right) {
                nums[left++] = nums[right];
            }
            while (left < right && nums[left] <= pivot) left++;
            if (left < right) {
                nums[right--] = nums[left];
            }
        }
        nums[left] = pivot;
        return left;
    }

    public static void quick(int[] nums, int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(nums, left, right);
            quick(nums, left, dp-1);
            quick(nums, dp+1, right);
        }
    }

    // 迭代算法
    // 用栈来保存范围，知道栈为空
    public static void quickSort(int[] nums) {
        Stack<Integer> ranges = new Stack<>();
        ranges.push(0);
        ranges.push(nums.length-1);
        while (!ranges.empty()) {
            int right = ranges.pop();
            int left = ranges.pop();
            if (right - left <= 0) continue;

            // 快速排序
            int dp = partition(nums, left, right);
            ranges.push(left);
            ranges.push(dp - 1);

            ranges.push(dp + 1);
            ranges.push(right);
        }
    }

    public static void main(String[] args) {
        int[] test = {1,2};
//        quick(test, 0, 8);
        quickSort(test);
        for (int i : test) {
            System.out.printf(i + "");
        }
    }

}
