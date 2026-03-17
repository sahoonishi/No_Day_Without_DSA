import java.util.Arrays;

public class MoveZeros {
    // beats 78% 3ms
    class Solution {
        public void moveZeroes(int[] nums) {
            // if (nums.length == 1)
            // nums = nums;
            int i = 0;
            int j = i + 1;
            while (i < nums.length && j < nums.length) {
                if (nums[i] == 0 && nums[j] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                } else if (nums[j] == 0 && nums[i] != 0) {
                    i++;
                } else if (nums[i] != 0 && nums[j] != 0) {
                    i++;
                }
                j++;
            }
            // i++;
            System.out.println(Arrays.toString(nums));
        }
    }
    // More optimized beats 90% 2ms
    class Solution2 {
    public void moveZeroes(int[] nums) {
        int j = 0; // Pointer to place the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap current element with the element at index j 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;   // Move j to the next index for placing non-zero
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
    public static void main(String[] args) {
        int[] arr = {1,0,9,0,12};
        MoveZeros zero = new MoveZeros();
        Solution obj = zero.new Solution();
        obj.moveZeroes(arr);
    }
}
