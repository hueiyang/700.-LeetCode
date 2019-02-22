class Solution {// Runtime: 2 ms, faster than 100.00% Memory Usage: 37.3 MB, less than 69.43%
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // from the end of array nums1 and nums2.
        int i = m-1;
        int j = n-1;
       
        // Case 1: when nums1 is over to -1, we asign value from nums2.
        // Case 2: when nums2 is over to -1, we asign value from nums1.
        // Case 3: Normal case which one is larger.
        for(int k = m+n-1 ; k >= 0 ; k--){
            if(i < 0)
                nums1[k] = nums2[j--];
            else if(j < 0)
                nums1[k] = nums1[i--];
            else if(nums1[i] < nums2[j])
                nums1[k] = nums2[j--];
            else
                nums1[k] = nums1[i--];
        }
    }
}
// Old version 4ms
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int flag1 = m-1;
//         int flag2 = n-1;
//         int now = m+n-1;
        
//         while(now > 0 || (flag1==-1 && flag2==-1)){
//             // System.out.print("Now " + nums1[flag1] + " v.s. " + nums2[flag2]);

//             if(flag1 == -1 || nums1[flag1] <= nums2[flag2]){
//                 nums1[now] = nums2[flag2];
//                 if(flag2 > 0)    flag2--;
//                 else flag2 = -1;
//                 now--;
//             }else if(flag2 == -1 || nums1[flag1] > nums2[flag2]){
//                 nums1[now] = nums1[flag1];
//                 if(flag1 > 0)   flag1--;
//                 else flag1 = -1;

//                 now--;
//             }
//             System.out.print(" ok >> " + nums1[now+1] + "\n");
//         }
        
//         if(flag1 == -1){
//             for(int i = flag2 ; flag2 >= 0 ; flag2--){
//                 nums1[now] = nums2[flag2];
//                 now--;
//             }
//         }else{
//             for(int i = flag1 ; flag1 >= 0 ; flag1--){
//                 nums1[now] = nums1[flag1];
//                 now--;
//             }
            
// //         }
//     }
// }