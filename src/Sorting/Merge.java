package Sorting;

/**
 * Created by Retty on 2016-03-28.
 * 归并排序：对每一小块进行排序，逐渐扩大到整个数组
 * 归并排序：是一种比较占内存，但却效率高且稳定的算法
 */
public class Merge {

    // 递归算法
    public static void sort(int[] data, int left, int right) {
        if (left >= right) return;
        int center = (left + right) / 2;
        sort(data, left, center);
        sort(data, center+1, right);
        merge(data, left, center, right);
    }

    public static void merge(int[] data, int left, int center, int right) {
        // 临时数组
        int[] tmpArr = new int[data.length];
        // 右数组第一个元素索引
        int mid = center + 1;
        // third 记录临时数组的索引
        int third = left;
        // 缓存左数组第一个元素的索引
        int tmp = left;
        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中
        // （原left-right范围的内容被复制回原数组）
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }

    public static void sortMerge(int[] nums) {
        sort(nums, 0, nums.length-1);
    }

    // 迭代算法
    public static void mergeSort(int[] nums) {
        int n = nums.length;
        int next, left_min, left_max, right_min, right_max;
        int[] tmpArr = new int[n];

        for (int i = 1; i < n; i++) {
            // 每次都从0开始，数组的头元素开始
            for (left_min = 0; left_min < n-i; left_min = right_max) {
                right_min = left_max = left_min + i;
                right_max = left_max + i;
                // 右边的下标最大值只能为n
                if (right_max > n) right_max = n;
                // next是用来标志temp数组下标的，由于每次数据都有返回到K，
                // 故每次开始得重新置零
                next = 0;
                // 如果左边的数据还没达到分割线且右边的数组没到达分割线，开始循环
                while (left_min < left_max && right_min < right_max) {
                    if (nums[left_min] < nums[right_min]) {
                        tmpArr[next++] = nums[left_min++];
                    } else {
                        tmpArr[next++] = nums[right_min++];
                    }
                }
                while (left_min < left_max) {
                    // 如果left_min小于left_max，说明现在左边的数据比较大
                    // 直接把它们接到数组的min之前就行
                    nums[--right_min] = nums[--left_max];
                }
                while (next > 0) {
                    nums[--right_min] = tmpArr[--next];
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] test = {9,8,7,6,5,87,3,2,1};
//        sortMerge(test);
        mergeSort(test);
        for (int i : test) {
            System.out.printf(i + "");
        }
    }

}
