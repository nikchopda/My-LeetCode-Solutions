class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] index=new int[2];
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=0;
                sum=numbers[i]+numbers[j];
                if(sum==target){
                    index[0]=i+1;
                    index[1]=j+1;
                    
                }
            }
        }
        return index;
    }
}