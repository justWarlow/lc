/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode p1 = dummy;
        ListNode p2 = l2; 
        while (p1.next != null && p2 != null) {
	    	if(p2.val < p1.next.val) {
	    		ListNode t = p2;
	    		p2 = p2.next;
	    		t.next = p1.next;
	    		p1.next = t;
	    	}
	    	p1 = p1.next;
	    }
	    if (p1.next == null && p2 != null) {
                p1.next = p2;
            }
	    return dummy.next;
    }
}
