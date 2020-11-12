class Solution {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int mod=0;
        int mul=1;
        int sum=0;
        while(n>0){
            mod=n%10;
            list.add(mod);
            n=n/10;
        }
        
        for(Integer x:list){
            mul*=x;
            sum+=x;
        }
        
        return mul-sum;
    }
}