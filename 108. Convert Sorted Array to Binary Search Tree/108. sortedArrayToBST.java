/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0 ) return null;
        
        TreeNode root = go(nums, 0, nums.length);
        
        return root;
    }
    
    public TreeNode go(int[] nums, int low, int high){
        if(low >= high)
            return null;
        
        int mid = (low + high)/2;
        
        TreeNode head = new TreeNode(nums[mid]);
        head.left = go(nums, low, mid);
        head.right = go(nums, mid+1, high);
        
        return head;
    }
}