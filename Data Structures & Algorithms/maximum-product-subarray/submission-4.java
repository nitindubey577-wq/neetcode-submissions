class Solution {
    public int maxProduct(int[] nums) {
        int p =1;
        int s=1;
        int n = nums.length;
        int max=nums[0];
        int mp = Integer.MIN_VALUE;
        int mp2= Integer.MIN_VALUE;
        for ( int i =0; i<nums.length; i++){
            p = p * nums[i];
             mp2 = Math.max(p , mp2);
            if( p == 0)  p =1;

            s = s *nums[n-i-1];
             mp = Math.max(s , mp);
            if( s == 0)  s =1;
             
        }
       
        return Math.max( mp,mp2);
    }
}
