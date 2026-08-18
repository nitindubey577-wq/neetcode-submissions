class Solution {
    Integer[][] dp;
    int help( int[] c , int  t , int i){
        if( t == 0) return 0;
        if ( i >= c.length )  return 100000;
        if (   t < 0 ) return 100000;
        if( dp[i][t] != null) return dp[i][t];
        return  dp[i][t] = Math.min( 1+ help( c , t-c[i] , 0) ,help( c , t , i+1) );
        

    }
    public int coinChange(int[] coins, int amount) {
        dp = new Integer[coins.length][amount+1];

  int ans = help( coins , amount , 0) ;
  if ( ans== 100000) return -1;
  return ans;
    }
}
