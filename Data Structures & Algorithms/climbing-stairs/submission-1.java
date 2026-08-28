class Solution {
  int help( int  n , Integer[] dp){
    if( n ==1 || n == 2) return n; // base condition
    if( dp[n] != null) return dp[n];
     return dp[n]= help( n-1 , dp)+ help(n-2, dp);

  }

public int climbStairs(int n) {
  Integer[] dp = new Integer[n+1]; // creating a n size dp
  return help( n , dp);
}
}