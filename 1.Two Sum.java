
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        List<Integer> ls = new ArrayList<>();
        
        for(int i=0; i < nums.length; i++)
        {
            if(ls.contains(target - nums[i]))
                return new int[]{i,ls.indexOf(target - nums[i])};
            
            ls.add(nums[i]);
        }
      
        return new int[]{0};
    }
}
