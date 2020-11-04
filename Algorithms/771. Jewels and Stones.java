class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] Jstring= J.toCharArray();
        char[] Sstring = S.toCharArray();
        
        int count=0;
        
        for(int i=0;i<Jstring.length;i++){
            for(int j=0;j<Sstring.length;j++){
                if(Jstring[i]==Sstring[j])
                    count++;
            }
        }
        return count;
    }
}