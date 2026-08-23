class Solution {
    Boolean[] dp;
    HashSet<String> hm  = new HashSet<>();
    boolean help( String s , List<String> w , int i , String a){
     if( i >= w.size()) return false;
     if( a.equals(s)) return true;
        if (!s.startsWith(a)) return false;
     String d = a + "$" + i;
     if( hm.contains(d))  return false;
     hm.add(d);
     if( a.length() > s.length() ) return false;
     boolean take = help( s , w , 0 , a+w.get(i));
     boolean ntake= help( s ,w , i+1 , a);
     return take || ntake;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new Boolean[s.length() + 1];
       return  help( s , wordDict , 0 ,"");
    }
}