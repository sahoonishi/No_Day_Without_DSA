package Array.Medium;

public class RotateArrayToKth {
    class Solution {
        public void rotate(int[] nums, int k) {
            // [1,2,3,4,5,6,7] -> [5,6,7,1,2,3,4] k=3
            // int[] arr = new int[nums.length];
            k = k % nums.length;
            nums = reverse(reverse(reverse(nums, 0, nums.length - 1), 0, k-1), k, nums.length - 1);
            // nums = reverse(nums,0,nums.length-1);
            System.out.println("After reversing whole array: ");
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

        public int[] reverse(int[] arr, int start, int end) {
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        RotateArrayToKth obj = new RotateArrayToKth();
        Solution sol = obj.new Solution();
        sol.rotate(arr, 4);
    }
}
