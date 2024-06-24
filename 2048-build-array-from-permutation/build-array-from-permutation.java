class Solution {
    public int[] buildArray(int[] nums) {
        int CONST = 1001;
        for(int i=0;i<nums.length ;i++){
            int a = nums[i];
            int b = nums[a]%CONST;
            nums[i]=a+b*CONST;
        }
        for(int t=0;t<nums.length;t++){
            nums[t]= nums[t]/CONST;
        }
        return nums;
    }
}