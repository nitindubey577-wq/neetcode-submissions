class Solution {
int help( int k , int[] nums ){
   long ans =0;
   for ( int i =0; i<nums.length; i++){
      ans = ans + (nums[i] + k-1 ) / k;
   }
   return (int) Math.min(ans, Integer.MAX_VALUE);
}
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int p : piles) if(p > max) max = p;
        int l =1;
        int j=max;
        int m=0;
        int res = max;
        while ( l <= j){
         m = l + (j - l)/2;
        if( help( m , piles) <= h ){
         res = m;
         j = m-1;
        }
      else {
          l = m+1;
      }
        }
        return res;
          }
}
