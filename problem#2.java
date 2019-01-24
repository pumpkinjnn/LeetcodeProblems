/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1, val2;
        int sum = l1.val + l2.val;
        int ones = sum%10;
        int tens = sum/10;
        ListNode head = new ListNode(ones);
        ListNode cur = head;
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null || l2 != null){
            val1 = l1 == null? 0:l1.val; 
            val2 = l2 == null? 0:l2.val; 
            l1 = l1 == null? null: l1.next;
            l2 = l2 == null? null: l2.next;
            sum = val1 + val2 + tens;
            ones = sum%10;
            tens = sum/10;
            cur.next = new ListNode(ones);
            cur = cur.next;
        }
        
        if(tens != 0){
            cur.next = new ListNode(tens);
        }
        return head;
    }
}
