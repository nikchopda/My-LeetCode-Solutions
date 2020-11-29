class Solution {
    int length;
	int[] isTrue;
	int[] arrQ;
	public boolean canReach(int[] arr, int start) {
	  
		length = arr.length;
		isTrue = new int[length];
		arrQ = arr;
        return dfs(start);  
    }
	
	public boolean dfs(int start) {
		if(start < 0 || start >= length){
			return false;
		}
		
		if(arrQ[start]==0){
			return true;
		}
		
		if(isTrue[start]==1){
			return false;
		}else{
			isTrue[start]=1;
			return dfs(start+arrQ[start])||dfs(start-arrQ[start]);
		}
	}
}
