class Solution {
    int n;
    void dfs( int i , int[][] mat){
        for ( int j=0; j<n; j++){
            if(mat[i][j]== 1){
                mat[i][j]=0;
                dfs(j , mat);
            }
        }
    }

    public int findCircleNum(int[][] mat) {
        int cnt=0;
        n = mat.length;
        for ( int i =0; i<n; i++){
            if( mat[i][i]== 1){
            dfs( i , mat);
            cnt++;
            }
        }
        return cnt;
    }
}