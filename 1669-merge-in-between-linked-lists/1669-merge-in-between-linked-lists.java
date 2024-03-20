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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode temp=list1;
        
        ListNode d1=null;
        ListNode d2=null;
        int c=0;
        while(temp!=null)
        {
            if(c==a-1)
            {
                d1=temp;
                
                
            }
             if(c==b)
            {
                d2=temp;
                
                
            }
            
            c++;
            temp=temp.next;
            
        }
        
        d1.next=list2;
        ListNode wemp=list2;
        while(wemp.next!=null)
        {
            wemp=wemp.next;
        }
        
        
        wemp.next=d2.next;
        
        
        
        
        
        
        
        
        
        
        
        
        
      return list1;  
        
        
    }
}