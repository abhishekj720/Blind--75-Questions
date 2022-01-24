// Given an integer array nums, return the length of the longest strictly increasing subsequence.

// A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 1) return 1;
        int[] lis = new int[nums.length];
        Arrays.fill(lis,1);
        int max =1;
        for(int i=1; i < lis.length; i++)
        {   int j=0;
            while(j < i)
            {   if(nums[j] < nums[i])
                {   
                    lis[i] = Math.max(lis[j]+1, lis[i]);
                    max = Math.max(max,lis[i]) ;
                }
             j++;
                
            }
        }
        
        return max;
        
    }
}
