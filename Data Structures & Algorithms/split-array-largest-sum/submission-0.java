class Solution {
    boolean help( int m , int k , int[] nums){
        int c=0;
        int p=1;
        for( int i =0; i<nums.length; i++){
            if( nums[i] + c > m){
                p++;
                c=0;
            }
            c += nums[i];
            if( p > k) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {

        int sum=0;
        int max=0;
        for ( int e : nums){
            sum += e;
            max =Math.max( max , e);
                   }
                   int ans=-1;
                   int l =max;
                   int h=sum;
                   while( l<=h){
                    int m =( l+h)/2;
                    if( help( m , k , nums)){
                         h=m-1;
                         ans =m;
                    }
                    else {
                        l=m+1;
                    }
                   }
                   return ans;
    }
}