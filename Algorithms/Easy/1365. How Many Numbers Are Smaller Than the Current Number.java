class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] a=new int[nums.length];
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]>nums[j]){
                        count++;
                    }
                }
            }
            a[i]=count;
        }
        return a;
    }
}