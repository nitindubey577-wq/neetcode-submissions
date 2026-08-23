class Solution {

    Integer[][] dp;
    int help( int i , int sum , int[] nums){
        if( i >= nums.length) return 0;
      if( sum < 0) return 0;
        if( sum == 0) return 1;
             if( dp[i][sum] != null) return dp[i][sum];
       
       return dp[i][sum]= help( 0, sum- nums[i] , nums) + help(i+1 , sum , nums);
    }
 public int combinationSum4(int[] nums, int target) {
        int sum=0;

       
         dp = new   Integer[nums.length+1][target+1];
    return help(  0 , target , nums);
    }
}


    