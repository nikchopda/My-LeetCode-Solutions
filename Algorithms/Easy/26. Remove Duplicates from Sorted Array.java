class Solution {
    public int removeDuplicates(int[] nums) {
        int x=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[x++]=nums[i+1];
            }
        }
        return x;
    }
}