// Brute force (233ms)

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums.length;j++) {
                if (i != j && nums[i] == nums[j]) {
                    // i = i + 2;
                    // j = i + 1;
                    // ans = nums[i];
                    break;
                } else {
                  if (j==nums.length-1)  {
                    ans = nums[i];
                    return ans;
                    }
                    // j++;
                }
            }
        }
        return ans;
    }
}

// 0 ms

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int ele:nums){
            ans = ans ^ ele;
        }
        return ans;
    }
}
