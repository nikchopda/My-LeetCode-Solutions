class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length];
        int[] mix=new int[nums.length];
        
        int a_i=0;
        int b_i=nums.length/2;
        
        for(int i=0;i<nums.length/2;i++){
            a[i]=nums[i];
        }
        
        for(int j=nums.length/2;j<nums.length;j++){
            b[j]=nums[j];
        }
        
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                mix[k]=a[a_i];
                a_i++;
            }
            else{
                mix[k]=b[b_i];
                b_i++;
            }
        }
        
        return mix;
    }
}