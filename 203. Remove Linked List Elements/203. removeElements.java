/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {// Runtime: 3 ms, faster than 100.00% Memory Usage: 41 MB, less than 100.00%
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans;
        
        // 去除開頭是val值的node
        while( head != null && head.val == val)
            head = head.next;
        
        ans = head;
        
        while(head != null){
            // 若next為val值，則把next指向下一個非val的 node
            while( head.next != null && head.next.val == val)
                head.next = head.next.next;
            
            // 指標移至 .next
            head = head.next;
        }
        
        return ans;
    }
}