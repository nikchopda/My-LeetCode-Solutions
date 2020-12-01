class Solution {
public:
    int maxPower(string s) {
         int t=1;
    int max=1;
    int n=s.size();
    if(n==0)
        return 0;
    for(int i=1;i<n;i++)
        {
            if(s[i]==s[i-1])
                t++;
            else
                {
                    max=max>t?max:t;
                    t=1;
                }            
        }
    max=max>t?max:t;
    return max;
    }
};