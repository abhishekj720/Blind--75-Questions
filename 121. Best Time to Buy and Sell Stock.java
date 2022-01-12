//You are given an array prices where prices[i] is the price of a given stock on the ith day.

//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 
class Solution {
    public int maxProfit(int[] a) {
        
        int diff =0, max =0, min = Integer.MAX_VALUE;
        
        for(int i= a.length-1; i >=0; i-- )
        {
            if(a[i] > max)
            {
                max = min =a[i];
            }
            else if(a[i] < min)
            {
                min = a[i];
                diff = Math.max(diff,max-min);
            }
        }
        return diff;
        
    }
}
