class Solution {
public:
    int calDiv(vector<int>& nums, int div) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = 0;
            if (nums[i] % div == 0) {
                num = nums[i] / div;
            }
            else {
                num = nums[i] / div + 1;
            }
            sum += num;
        }
        return sum;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int n = nums.size();
        if (n == 0) {
            return 0;
        }
        int left = 1, right = threshold;
        for (int i = 0; i < n; i++) {
            right = max(right, nums[i]);
        }
        while (left < right) {
            int mid = (left + right) / 2;
            int sum = calDiv(nums, mid);
            if (sum <= threshold) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
};