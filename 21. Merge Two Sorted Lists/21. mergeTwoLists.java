/**
 * Definition for singly-linked list.
 * public class  {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {    // Runtime: 6 ms, faster than 99.77%
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         ListNode head = null;
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val > l2.val){
            l2.next = mergeTwoLists(l1, l2.next);
			return l2;
            // head = l2;
            // head.next = mergeTwoLists(l1, l2.next);
            // return head;
        }else{
            l1.next = mergeTwoLists(l1.next, l2);
			return l1;
            // head = l1;
            // head.next = mergeTwoLists(l1.next, l2);
            // return head;
        }
    }
}

/*
My old version
ListNode ans;
        ListNode res;
        
        if(l1==null && l2==null) return null;
        if(l1==null && l2!=null) return l2;
        if(l1!=null && l2==null) return l1;
        
        if(l1.val > l2.val){
            ListNode tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        
     
        ans = new ListNode(l1.val);
        res = ans;
        while(l1.next!=null){
            // System.out.print(l1.val + "->");
            ans.next = new ListNode(l1.val);
            ans = ans.next;
            if(l2 != null){
                if(l1.val <= l2.val && l1.next.val > l2.val){
                    // System.out.print("L2 insert [" + l2.val + "]");
                    ans.next = new ListNode(l2.val);
                    ans = ans.next;
                    l2 = l2.next;
                }
                while(l2!= null && ans.val <= l2.val && l1.next.val > l2.val ){
                    // System.out.print("L2 insert [[" + l2.val + "]]");
                    ans.next = new ListNode(l2.val);
                    ans = ans.next;
                    l2 = l2.next;
                }
            }
            l1 = l1.next;
        }
        
        if(l1 != null){
            ans.next = l1;
            ans = ans.next;            
        }
        if(l2 != null)
            ans.next = l2;
        
        // System.out.println("Final:: " + res.val + "...." + ans.val);
        
        return res.next;
        */