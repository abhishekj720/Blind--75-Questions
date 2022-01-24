//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

class Solution {
    public int maxArea(int[] height) {
        
        int rmax = height[height.length-1];
        int lmax= height[0];
        int lpos = 0;
        int rpos = height.length-1;
        
        int r= height.length-1;
        int l=0;
        int max =0;
        while(l < r)
        {
            if(height[l] > lmax)
            {
                lmax = height[l];
                lpos = l;
            }
            if(height[r] > rmax)
            {
                rmax = height[r];
                rpos = r;
            }
            
            
            int min = Math.min(lmax,rmax);
            
            max = Math.max(max, min*(rpos-lpos));
            
            if(height[l]> height[r])
            {
                r--;
            }
            else
            {
                l++;
            }
            
        }
        
        return max;
        
    }
}
