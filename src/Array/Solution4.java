package Array;

/**
 * Created by Retty on 2016-03-20.
 * Median of Two Sorted Arrays
 * 首先根据元素总奇偶确定中间数位置
 * 保证较小的数组在前面，然后不断进行比较，
 * 舍弃较小的值的前面的元素，继续查找
 */
public class Solution4 {

    double findKth(int a[], int startA, int m, int b[], int startB, int n, int k) {
        if (m > n) return findKth(b, startB, n, a, startA, m, k);
        if (m == 0) return b[startB + k-1];
        if (k == 1) return min(a[startA], b[startB]);

        int pa = min(k/2, m), pb = k -pa;
        if (a[startA + pa-1] == b[startB + pb-1]) return a[startA + pa-1];
        else if (a[startA + pa-1] > b[startB + pb-1]) {
            return findKth(a, startA, m, b, startB+pb, n-pb, k-pb);
        }else {
            return findKth(a, startA+pa, m-pa, b, startB, n, k-pa);
        }
    }

    private int min (int a, int b) {
        return a > b ? b : a;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int total = len1 + len2;

        if (total%2 != 0) {
            return findKth(nums1, 0, len1, nums2, 0, len2, total/2+1);
        }else {
            return (findKth(nums1, 0, len1, nums2, 0, len2, total/2) + findKth(nums1, 0, len1, nums2, 0, len2, total/2 + 1))/2;
        }
    }

}
