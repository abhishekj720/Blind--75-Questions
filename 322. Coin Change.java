// You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

// Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

// You may assume that you have an infinite number of each kind of coin.

class Solution {
    public int coinChange(int[] coins, int amount) {
    
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        Arrays.sort(coins);
        for(int i=1; i <= amount; i++)
        {
            for(int j=0; j < coins.length; j++)
            {
                if(i >= coins[j])
                    dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
                else
                    break;
            }
        }
        
        return dp[amount] == amount+1 ? -1 : dp[amount];
    }
}
