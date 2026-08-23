class Solution {
    Integer[][] dp;
    int help( int n , int i , int cnt){
        if (  n==0){
if( cnt < 2) return 0;
         return 1;
        }
        if( n < 0) return -1;
        if( i > n) return 0;
        if( dp[i][cnt] != null) return dp[i][cnt];
        return Math.max( i * help( n-i , i , cnt+1) ,help( n  , i+1 , cnt)  );
    }
    public int integerBreak(int n) {
    dp= new  Integer[n+1][n+1];
return help( n , 1 , 0);
    }
}