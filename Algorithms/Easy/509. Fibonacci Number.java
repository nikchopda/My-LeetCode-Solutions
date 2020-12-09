class Solution {
    public int fib(int N) {
        if(N == 0) return 0;
        
        int[] table = new int[N + 1];
        table[1] = 1;
        
        for(int i = 2; i < table.length; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        
        return table[N];
    }
}