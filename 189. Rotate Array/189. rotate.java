class Solution { // 0ms 100%
   public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);    // reverse the whole array
        reverse(nums, 0, k-1);              // reverse the first part
        reverse(nums, k, nums.length-1);    // reverse the second part
    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = tmp;
        }
    }
}

/* 
My old version. BAD: more space cost
        // if array length bigger than k, we just need to shift (k%length).
        if(nums.length < k ){
            k = k % nums.length;
        }
        
        // array length == k OR length == 1, we don't need to shift anymore.
        if(nums.length!=k||nums.length!=1){
            int[] tmp = new int[k];

            // we switch shifted part at first.
            for(int i = 0 ; i < k ; i++){
                tmp[i] = nums[nums.length-k+i];
                // System.out.println(tmp[i]);
            }
            
            // shift original val in array, using bottom-up direction.
            for(int i = nums.length-1 ; i >= k ; i--){
                nums[i] = nums[i-k];
                // System.out.println(nums[i]);
            }

            // fill another part val.
            for(int i = 0 ; i < k ; i++)
                nums[i] = tmp[i];
        }
*/