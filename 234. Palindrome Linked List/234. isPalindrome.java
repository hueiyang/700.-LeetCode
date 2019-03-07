/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution { // Runtime: 4 ms, faster than 20.39% Memory Usage: 41.1 MB, less than 95.80% 
    public boolean isPalindrome(ListNode head) {
        ListNode go = head;
        Stack stack = new Stack();
        
        // push all of the list value into stack.
        while(go != null){
            stack.push(go.val);
            go = go.next;
        }
        
        // trace list again and compare two value whether in sequnce.
        while(head != null){
            if(head.val != (int) stack.pop())
                return false;
            
            head = head.next;
        }
        
        return true;
    }
}