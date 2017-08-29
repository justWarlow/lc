/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode curr = null;
        ListNode head = null;
        if(lists == null || lists.length<1)
            return null;
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2){
                return l1.val - l2.val;
            }
        });
        for(int i=0;i<lists.length;++i){
            if(lists[i] != null){
                q.offer(lists[i]);
            }
        }
        while(!q.isEmpty()){
            ListNode tmp = q.poll();
            if(head == null){

                head = new ListNode(tmp.val);
                curr = head;
            } else {
                ListNode p = new ListNode(tmp.val);
                p.next = null;
                curr.next = p;
                curr = p;
            }
            if(tmp.next != null){
                q.offer(tmp.next);
            }
        }
        return head;
    }
}