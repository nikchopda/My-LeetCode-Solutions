class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat[0].length;j++){
                
                if(i==j){
                    sum+=mat[i][j];
                }
            }        
        }
        
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat[0].length;j++){
                
                if ((i + j) == (mat[0].length - 1)){
                    sum+=mat[i][j];
                }
            }        
        }
        if(mat[0].length%2!=0){
        int val=mat[mat[0].length/2][mat[0].length/2];
        sum=sum-val;
        }
        
        return sum;
    }
}