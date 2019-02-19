class Solution { // Runtime: 6 ms, faster than 97.50%
    public int removeDuplicates(int[] nums) {
        // 判斷不同處的指標, defalut: 1 預設有一個數字
        int nowFlag = 1;
	
        for(int i = 0 ; i < nums.length-1 ; i++){
            // 只要發現前後不同，就把不同的[i+1]指定到flag所在地
            if(nums[i] != nums[i+1]){
                nums[nowFlag] = nums[i+1];
                nowFlag++;
            }
        }
        
        // System.out.println(nowFlag+1);
        // 回傳現在Flag有幾個，就顯示nums array前幾個
        return nowFlag;
    }
}
