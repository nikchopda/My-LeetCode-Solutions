class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;        
        }
        
        if(target>nums[nums.length-1])
            return nums.length;
        
        
        if(target<nums[0])
            return 0;
        
        for(int j=0;j<nums.length-1;j++){
            if(target>nums[j] && target<nums[j+1])
                return j+1;
        }
        
        return 1;
    }
}