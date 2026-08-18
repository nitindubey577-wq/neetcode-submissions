class Solution {
    Integer[][] dp;
int help( int n , int i ){
    if( n == 0 ) return 0;
    if(  n <  0) return 100000;
    if( i*i > n) return 100000;
    if( dp[n][i] != null) return dp[n][i];
    return dp[n][i] = Math.min( 1+help( n - (i *i) , 1) , help( n , i+1));
}
    public int numSquares(int n) {
        dp = new Integer[n+1][1001];
      return  help(  n , 1 );
    }
}