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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
   
        ListNode temp=head;
        ListNode j = new ListNode(-1);
        ListNode k = new ListNode(-1);
        ListNode a=j;
        ListNode b=k;
          while(temp!=null)
          {
              if(temp.val<x)
              {
               a.next=temp;
                  a=a.next;
              }
              else
              {
               b.next=temp;
                  b=b.next;
                  
                  
                  
              }
                    temp=temp.next; 
          }
        
        b.next=null;
        a.next=k.next;
        
        
        
        
        
        
          
      return j.next;  
        
    }
}