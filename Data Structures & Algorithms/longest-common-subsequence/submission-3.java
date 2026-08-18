class Solution {
    Integer[][] dp;

    int help(String s , String t , int i , int j){
        if( i >= s.length()) return 0;
         if( j >= t.length()) return 0;
         int take =0;
         if( dp[i][j] != null) return dp[i][j];
         if( s.charAt(i) == t.charAt(j)){
         take = 1 + help( s , t , i+1  , j+1);
         }
         return dp[i][j]= Math.max( take ,Math.max( help( s , t , i+1 , j) ,  help( s , t , i , j+1)));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new Integer[text1.length()][text2.length()];
    return    help( text1 , text2 , 0 , 0);
    }
}
