import java.util.ArrayList;

public class RemoveDuplicateElementFromArray {
    class Solution {

        //NOT OPTIMIZED SOLUTION O(n^2) TIME COMPLEXITY (17ms)(Beats 3%) AND O(n) SPACE COMPLEXITY (47MB) (Beats 60%)
        public int removeDuplicates(int[] nums) {
            ArrayList<Integer> arr = new ArrayList<>();
            int a = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!arr.contains(nums[i])) {
                    arr.add(nums[i]);
                    nums[a] = arr.get(a);
                    a++;
                }
            }
            return arr.size();
        }
    }



    //-----------------------------------------TWO POINTERS APPROACH-----------------------------------------


    
    class Solution2 {
        //OPTIMIZED SOLUTION O(n) TIME COMPLEXITY (1ms)(Beats 100%) AND O(1) SPACE COMPLEXITY (47MB) (Beats 60%)
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) return 0;

        int j = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[j])
            {
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 3, 4, 4, 5};
        RemoveDuplicateElementFromArray obj = new RemoveDuplicateElementFromArray();
        Solution sol = obj.new Solution();
        System.out.println(sol.removeDuplicates(arr)); // 5
    }
}
