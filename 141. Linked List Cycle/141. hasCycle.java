/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution { //1 ms, faster than 94.41%
    public boolean hasCycle(ListNode head) {
        if( head == null ) return false;
        
        // create a flag to know which I have visited.
        ListNode myFlag = new ListNode(0);

        while(head.next != null){
            ListNode tmp = head;
            head = head.next;
            // I have visited, so set the .next as my FlagNode.
            tmp.next = myFlag;
        }
        // if .next is null and current node is my FlagNode.
        if(head == myFlag)  return true;
        else    return false;
    }
}

/*
第二種方法，slow and fast 的跑法

ListNode slow = head, fast = head;

while(fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if(slow == fast) {
        return true;
    }
}
return false;
*/