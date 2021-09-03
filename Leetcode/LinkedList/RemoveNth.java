
public class RemoveNth {
    /*
    n=3
     1  2  3  4  5  6
     toend will be 3
     4 is ans
     

    */
    
 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  public ListNode removeNFromEnd(ListNode head, int n) {
    ListNode toend=head;
    ListNode nth=head;
    
    int c=0;
    if(c<n && toend.next !=null){
        toend=toend.next;
        c++;
    }
    
    while(toend.next != null){
        toend=toend.next;
        nth=nth.next;
    }
    //found the nth value
    //need to find pre of nth
    ListNode pre=head;
    
    while(pre.next.val != nth.val){
        pre=pre.next;
    }
    
    pre.next=nth.next;
    
    return head;
    
    
    

    
}

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode initial=head;
        ListNode nth=head.next;
        ListNode pre=head;
        int c=0;
        while(c<n-1){
            nth=nth.next;
            pre=pre.next;
            c++;
        }
        while(nth!=null){
            nth=nth.next;
            initial=initial.next;
            pre=pre.next;
        }
        
        pre.next=initial.next;
        return initial;
        
    }

}