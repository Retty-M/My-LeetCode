package Sorting;

/**
 * Created by Retty on 2016-04-04.
 * 堆排序：是一种选择排序，其时间复杂度为O(nlogn)
 * 堆（完全二叉树）分为大顶堆和小顶堆
 * 若想得到升序，则建立大顶堆，若想得到降序，则建立小顶堆
 */
public class Heap {

    public static void heapAdjust(int[] nums, int start, int end) {
        int temp = nums[start];

        for (int i = 2*start + 1; i <= end; i*=2) {
            // 大顶堆
            // 假设根结点的序号为0，所以i结点左孩子和右孩子分别为2i+1和2i+2
//            if (i < end && nums[i] < nums[i+1]) i++;
//            if (temp > nums[i]) break;

            // 小顶堆
            if (i < end && nums[i] > nums[i+1]) i++;
            if (temp < nums[i]) break;

            nums[start] = nums[i];
            start = i;
        }

        nums[start] = temp;
    }

    public static void heapSort(int[] nums) {
        int n = nums.length;
        // 先建立大顶堆
        for(int i = n/2-1; i>=0; --i)
        {
            heapAdjust(nums,i,n);
        }
        // 进行排序
        for (int i = n-1; i > 0; --i) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapAdjust(nums, 0, i-1);
        }

    }

    public static void main(String[] args) {
        int[] test = {1,2,2,3,4};
        heapSort(test);
        for (int i : test) {
            System.out.printf(i + "");
        }
    }

}
