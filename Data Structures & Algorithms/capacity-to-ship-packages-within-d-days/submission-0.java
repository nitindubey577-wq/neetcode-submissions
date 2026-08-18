class Solution {
    int help(int m , int[] weights){
        int ans=1;
        int load=0;
        for( int i =0; i<weights.length; i++){
            if( load+weights[i] >  m ){
               load=0;
               ans++;
            }
            load= load+weights[i];
        }
        return ans;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum =0;
        int s=0;
         for (int weight : weights) {
          s += weight;
             sum= Math.max(sum, weight);
        }
        int l=sum;
        int h = s;
        while ( l <= h){
          int m =(l+h)/2;
          if ( help( m , weights) <=  days){
            h= m-1;
          }
          else {
            l =m+1;
          }
        }
        return l;
    }
}