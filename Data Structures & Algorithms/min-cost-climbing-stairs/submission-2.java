class Solution {
    int help( int i , int[] dp , int[] cost){
        if( i >= cost.length) return  0;
        if( dp[i] != -1) return dp[i];
        return dp[i]= cost[i]+Math.min( help( i+1 , dp , cost ) , help(i+2 , dp , cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill( dp , -1);
        return Math.min( help( 0 , dp , cost) , help( 1 , dp , cost));
    }
}
