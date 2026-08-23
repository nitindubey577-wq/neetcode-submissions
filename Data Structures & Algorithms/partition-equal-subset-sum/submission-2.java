class Solution {
    Boolean[][] dp;
    boolean help( int i , int sum , int[] nums){
        if( i >= nums.length) return false;
      if( sum < 0) return false;
        if( sum == 0) return true;
             if( dp[i][sum] != null) return dp[i][sum];
        if( sum  < 0 ) return false;
       return dp[i][sum]= help( i+1 , sum- nums[i] , nums) || help(i+1 , sum , nums);
    }
    public boolean canPartition(int[] nums) {
        int sum=0;

        for ( int e :  nums) sum += e;
        if( sum % 2 != 0) return false;
         dp = new  Boolean[nums.length+1][sum/2+3];
    return help(  0 , sum/2 , nums);
    }
}
