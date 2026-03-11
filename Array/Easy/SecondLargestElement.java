public class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
        int max = -10000;
        int second_max = -10000;
        if(nums.length == 1) return -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                second_max = max;
                max = nums[i];
            }else if(nums[i] < max && nums[i] > second_max){
                second_max = nums[i];
            }
        }

        return second_max == -10000 ? -1 : second_max;
    }

    public static void main(String[] args) {
        int [] arr = {3, 7, 1, 9, 4};
        System.out.println(secondLargestElement(arr));
    }
}
