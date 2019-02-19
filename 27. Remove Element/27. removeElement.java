class Solution {// Runtime: 4 ms, faster than 98.92% Memory Usage: 37.7 MB, less than 100.00% 
    public int removeElement(int[] nums, int val) {
        // 標記有幾個非val值
        int flag = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            // 如果scan到的值 != val 表示可以存起來
            if(nums[i] != val)
                // 把值存進現在flag的位置
                nums[flag++] = nums[i];
        }

        return flag;
    }
}