class Solution {
int help( int i , int[] cost , int[] dp){
    if( i >= cost.length) return 0;
    if( dp[i] != -1) return dp[i];
    return dp[i]= cost[i]+ Math.min( help( i+1, cost , dp) , help(i+2 , cost , dp));
}
    public int minCostClimbingStairs(int[] cost) {
    int[] dp = new int[cost.length+1];
    Arrays.fill( dp , -1);
    return Math.min( help( 0 , cost , dp) , help( 1, cost , dp));
    }
}
