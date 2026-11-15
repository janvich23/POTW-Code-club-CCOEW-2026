class MatrixDiagonal_lvl0 {
    public int diagonalSum(int[][] mat) {
        int s=0;
        int n=mat[s].length;
        for(int i=0;i<n;i++) {
            s+=mat[i][i];
            mat[i][i]=0;
            s+=mat[i][n-1-i];            
        }
        return s;
    }
}
