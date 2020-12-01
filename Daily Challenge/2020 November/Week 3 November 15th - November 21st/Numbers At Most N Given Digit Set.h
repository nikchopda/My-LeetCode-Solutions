class Solution {
public:
    int atMostNGivenDigitSet(vector<string>& D, int N, bool flag = false) {
        int count = 0;
        string num = to_string(N);

        // less than a certain number of bits smaller than N N a
        for(int i = 1; !flag && i < num.size(); ++i)
        {
            count += pow(D.size(), i);
        }

        // the same number of bits and N
        for(int i = 0; i < D.size(); ++i)
        {
            if(num[0] > D[i][0]) // The first is less than N
            {
                count += pow(D.size(), num.size()-1); 
            }
            else if(num[0] == D[i][0]) // The first is equal to N
            {
                string subNum = num.substr(1, num.size());
                if(subNum.empty()) { ++count; continue; }
                else if(subNum[0] == '0') continue; // The first number is 0
                count += atMostNGivenDigitSet(D, stoi(subNum), true); 
            }
        }

        return count;
    }
};