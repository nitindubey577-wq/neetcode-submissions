class Solution {
    
  int z=0;  
  Long[][] dp;

 long help(int[] nums,  int target , int i ) {
          if (target > z || target < -z) return 0;

if( i == nums.length){ 
if( target == 0) {return 1;
}
return 0;
}
if( dp[i][target+z] != null) return  dp[i][target+z];
return  dp[i][target+z] =help( nums , target-nums[i] , i+1) + help( nums , target+nums[i] , i+1);
     }
    public int findTargetSumWays(int[] nums, int target) {
        
         for ( int e : nums) z +=e;
          if (target > z || target < -z) return 0;
         dp = new Long[nums.length+1][(2*z)+1]; 
        return (int)help(nums,  target , 0);
    }
}
