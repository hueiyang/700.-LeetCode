/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {// 2ms 90%
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if( headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        //if a & b have different len, then we will stop the loop after second iteration
        while( a!= b ){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            if(a == null)   a = headB;
            else    a = a.next;
            
            if(b == null) b = headA;
            else    b = b.next;
        }
        
        return a;
    }
}