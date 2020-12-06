class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max=0;
        int sum=0;
        
        if(accounts.length==1)
        {
            for(int i=0;i<accounts[0].length;i++){
                max+=accounts[0][i];
            }
        }
        else{
            for(int i=0;i<accounts.length;i++){
                if(sum>max)
                    max=sum;
                sum=0;
                for(int j=0;j<accounts[i].length;j++){
                    sum+=accounts[i][j];
                }
            }
        }
        return max;
    }
}