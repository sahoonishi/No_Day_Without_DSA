import java.util.Arrays;

public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            nums1 = new int[m + n];

            for (int i = 0; i < n; i++) {
                nums1[m] = nums2[i];
                m = m + 1;
            }
            Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums1));
        }
    }
    class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = new int[m+n];
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }
}
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,3,5};
        MergeSortedArray obj = new MergeSortedArray();
        Solution sol = obj.new Solution();
        sol.merge(nums1, 3, nums2, 3);

    }
}
