class Solution {
    public boolean isPalindrome(int x) {
        boolean ans;
        
        if(x<0)
            return false;
        
        int r,sum=0,temp;    
        int n=x;  
  
        temp=n;    
        while(n>0){    
            r=n%10;
            sum=(sum*10)+r;    
            n=n/10;    
        } 
        
        if(temp==sum)    
            ans=true;    
        else    
            ans=false;
        
        return ans;
    }
}