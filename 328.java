class Solution {
    public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenStart = even;
            while (true) {
                if (even.next != null) {
                    odd.next = even.next;
                    odd = odd.next;
                }
                else break;
                if (odd.next != null)  {
                    even.next = odd.next;
                    even = even.next;
                }
                else break;
            }
            even.next = null;
            odd.next = evenStart;
            return head;
        }
  
}
