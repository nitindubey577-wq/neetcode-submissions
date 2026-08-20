class Solution {
    Integer[][] dp;
    int  help( int i , int[] nums , int prev){
        if( i >= nums.length) return 0;
        int take=0;
        if( dp[i][prev+1] != null) return dp[i][prev+1];
    if( prev == -1 || nums[prev] < nums[i] ){
       take  = 1 + help( i+1 , nums  ,i);
    }
    int ntake  = help( i+1 , nums , prev);
    return dp[i][prev+1] =Math.max( take , ntake);
         
    }
    public int lengthOfLIS(int[] nums) {
        dp = new Integer[nums.length+1][nums.length+1];
     return help( 0 , nums ,   -1);
    }
}
