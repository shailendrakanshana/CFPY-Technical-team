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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int c = 0;
        while(temp!=null){
            temp = temp.next;
            c++;
        }
        int t = c-n;
        int i = 1;
        ListNode lemp = head;
        if(t==0){
            head = head.next;
        }
        else{
            while(lemp!=null){
                if(i==t){
                    lemp.next = lemp.next.next;
                    break;
                }
                else{
                    lemp = lemp.next;
                    i++;
                }
            }
        }
        return head;
    }
}