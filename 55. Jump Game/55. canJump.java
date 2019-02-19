class Solution {//73.98%
    public boolean canJump(int[] nums) {
        // 為了特例 [0] 這也是 true;
        if(nums.length < 2 ) return true;
        
        // 只考慮 元素為 0 的，從後面第二個開始判斷
        for(int curr = nums.length-2 ; curr >= 0 ; curr--){
            // 如果為 0，表示需要跳過他，因此先預設為 1.
            if(nums[curr] == 0){
                int neededJump = 1;
                
                // 開始往前尋找，需要跳得過元素0的位置
                // 只要neededJump > 現在能跳得步數，表示跳不過去，繼續往前找
                // 既然繼續往前找，neededJump就必須多一步++.
                while(neededJump > nums[curr]){
                    neededJump++;
                    curr--;
                    // 如果 curr 找到最一開始了都還沒辦法的話，表示跳不過元素0，False
                    if(curr < 0) return false;
                }
            }
        }
        // True: 完全沒有0元素存在
        // 或是跳得過去就會遍歷loop一回出來.
        return true;
    }
}

/* solution 1.
int maxIndex = nums.length-1;
int maxJump  = nums[0];
for(int i = 0; i <= maxJump; i++){
    maxJump=Math.max(maxJump,i+nums[i]);
    if(maxJump>=maxIndex) return true;
}
return false;
*/

/* My original solution. 
class Solution {
    public boolean canJump(int[] nums) {
        
        for(int i = 0 ; i < nums.length ; i++){
            if(jump(i, nums[i], nums))
                return true;  
            else
                return false;
        }
        return false;
    }
    
    public boolean jump(int index, int count, int[] nums){
        for(int i = 1 ; i < count+1 ; i++){
            if(index+i < nums.length-1 && nums[index+i] != 0){
                if(jump(index+i, nums[index+i], nums))
                    return true;            
            }else if (index+i == nums.length-1)
                return true;
        }
        
        return false;
    }
}
*/