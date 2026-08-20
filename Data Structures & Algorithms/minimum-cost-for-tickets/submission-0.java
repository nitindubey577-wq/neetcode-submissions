class Solution {
    Integer[] dp;
    int d( int  i , int[] nums , int c){
        int d = nums[i] +c-1;
        while(   i < nums.length && nums[i] <= d ){
            i++;
        }
        return i;
    }
    int help( int i , int[] cost , int []  nums){
        if( i >= nums.length) return 0;
        if( dp[i] != null) return dp[i];
         int take1 = 0 , take2=0 ,take3=0;
       take1 = cost[0]+help( d( i , nums , 1) , cost , nums);
           take2= cost[1]+help( d( i , nums , 7) , cost , nums);
        take3 = cost[2]+help( d( i , nums, 30) , cost , nums);
            return dp[i]=Math.min( take1 , Math.min( take2 , take3));
             }
    public int mincostTickets(int[] days, int[] costs) {
        dp = new Integer[days.length+1];
     return   help(  0 , costs , days);
    }
}