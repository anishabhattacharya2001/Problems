public class Reverse{

    public class ListNode{
        int val;
        ListNode next;
        //constructors

        public Listnode(){

        }
        public ListNode(int val){
            this.val=val;
        }
        public ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode reverseList(ListNode head) {
        
        //empty list
        
        ListNode curr=head;
        ListNode prev=null;
        
        while( curr != null  ){
            
            ListNode tempnext= curr.next;
            curr.next=prev;
            //now i need to update the values for the loop
            prev=curr;
            curr=tempnext;
            
        }
        
        return prev;
        
        
    }
}