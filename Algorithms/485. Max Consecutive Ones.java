class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] arr=new int[nums.length];
        int index=0;
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int a=arr[index];
                a++;
                arr[index]=a;
                count++;
            }
            if(nums[i]==0){
                index++;
                count=0;
            }
        }
        
        for(int i=0;i<arr.length;i++){
         if(arr[i]>=max){
             max=arr[i];
         }   
        }
        
        return max;
    }
}