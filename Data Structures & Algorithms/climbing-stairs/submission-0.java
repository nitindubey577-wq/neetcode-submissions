class Solution {
     int help( int[] dp , int n){
        if( n == 0) return 0;
        if( n==1) return 1;
        if( n ==2) return 2;
        if( dp[n] != 0) return dp[n];
        return dp[n]=   help(  dp , n-1)+  help(  dp , n-2);
             }
    public int climbStairs(int n) {
      int[] dp = new int[n+1];
    return  help(  dp , n);
    }
}
