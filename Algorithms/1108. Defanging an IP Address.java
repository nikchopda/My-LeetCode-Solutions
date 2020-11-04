class Solution {
    public String defangIPaddr(String address) {
        String x="";
        String[] aa = address.split("\\.");
        for(int i=0;i<aa.length-1;i++){
            x+=aa[i];
            x+="[.]";
        }
        x+=aa[(aa.length)-1];
        return x;
    }
}