class Solution {
    Integer[] dp;
int help( int i , int[] nums){
    if( i >= nums.length) return 0;
    if( dp[i] != null) return dp[i];
     return  dp[i]= Math.max( nums[i] + help( i+2, nums) , help( i+1 , nums ));
}
    public int rob(int[] nums) {
        dp = new Integer[nums.length+1];
     return help( 0 , nums);
    }
}
