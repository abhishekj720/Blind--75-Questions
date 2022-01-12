

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ls = new HashSet<>();
        for(int i=0; i < nums.length; i++)
        {
            if(ls.contains(nums[i]))
                return true;
            
            ls.add(nums[i]);
        }
        return false;
    }
}
