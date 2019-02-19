class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = (n+1)*n/2;
        
        for(int i = 0 ; i < n ; i++){
            ans-= nums[i];
        }
        
        return ans;
    }
}
/*
由於數列是從 0-n
所以數列長度+1就是這次input的 0 ~ n
因此總大小陸續相減剩下來的就會是missing number
*/