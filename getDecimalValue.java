/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int n=0;
        int value=0;
        ListNode lst = head;
        while (lst!=null) {
            n++;
            lst=lst.next;
        }
        while (head!=null) {
            int t = (int) Math.pow(2,(n-1));
            value+=((head.val)*t);
            n--;
            head=head.next;
        }
        return value;
    }
}
