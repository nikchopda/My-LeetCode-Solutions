class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] intArray = new int[2];
        int size = nums.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if((nums[i]+nums[j])==target){
                    intArray[0] =i; 
                    intArray[1] =j; 
                }
            }
        }
        return intArray;
    }
}