class Solution {
    Integer[] dp;
    int help( int  i , String s){
        if( i == s.length()) return 1;
        if( s.charAt(i) == '0') return 0;
        int take1=0 , take2=0;
        if( dp[i] != null) return dp[i];
        take2=  help( i+1, s);
   if (i < s.length() - 1) {   if (s.charAt(i) == '1' ||
               (s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
            take1 =  help( i+2 , s);
        }
   }
        return dp[i]= take1+take2;
    }
    public int numDecodings(String s) {
         dp = new Integer[s.length()];
         return  help(  0 , s);
        
    }
}
