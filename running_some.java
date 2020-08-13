class running_some {
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6};
        runningSum(nums);

        for(int j = 0; j < nums.length; j++){
            System.out.print(nums[j] + " ");
        }

    }    
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            nums[i] = sum;
            
        }
        return nums;
    }
}