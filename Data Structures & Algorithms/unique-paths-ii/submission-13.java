class Solution {
    Integer[][] dp;
 int   help( int i , int j , int[][] nums){
    
        if( i >= nums.length || j >=nums[0].length) return 0;
        if(  nums[i][j]==0 && i == nums.length-1 && j == nums[0].length-1 ){
            return 1;
        }
        if( dp[i][j] != null) return dp[i][j];
        if(  nums[i][j] == 1) return 0;
        return dp[i][j] =  help( i+1 , j, nums)+ help( i , j+1, nums);
    }
    public int uniquePathsWithObstacles(int[][] nums) {
      
         dp = new Integer[nums.length+1][nums[0].length+1];
       return  help( 0 , 0 , nums);
    }
}