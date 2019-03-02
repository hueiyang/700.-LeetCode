/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution { // Runtime: 1 ms, faster than 54.46% Memory Usage: 36 MB, less than 91.21%
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;
    }
}

// My version Runtime: 0 ms, faster than 100.00% Memory Usage: 36.3 MB, less than 14.72% 
// List ans = new ArrayList<Integer>();

// // case null ListNode return [].
// if(root == null) return ans;

// // Rule: LVR, left > center > right.
// if(root.left != null) 
//     ans.addAll(inorderTraversal(root.left));

// ans.add(root.val);

// if(root.right != null) 
//     ans.addAll(inorderTraversal(root.right));

// return ans;