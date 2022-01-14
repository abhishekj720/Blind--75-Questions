//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

//A subarray is a contiguous part of an array.




class Solution {
    public int maxSubArray(int[] nums) {
        
        int store[] = new int[nums.length];
        store[0] = nums[0];
        for(int i=1; i < nums.length; i++)
        {
           store[i] = (store[i-1]+nums[i])> nums[i] ? store[i-1]+nums[i] : nums[i]; //can use max function as well
        }
        
        int max = store[0];
        for(int i=0; i < nums.length; i++)
        {
            max = Math.max(store[i],max);
        }
        
        return max;
    }
}
