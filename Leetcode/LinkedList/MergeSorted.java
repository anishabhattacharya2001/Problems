
public class MergeSorted {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(){}
        public ListNode(int val){
            this.val=val;
        }
        public ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        
        if(head1==null && head2 == null){
            return null;
        }
        
        if(head1==null){
            return head2;
        }
        if(head2 ==null){
            return head1;
        }

        ListNode ans=new ListNode();
        ListNode headA=ans;
        
        while(head1 != null || head2 !=null){
            if(head1 != null && head2 != null){
                if(head1.val < head2.val){
                    ans.val=head1.val;
                    System.out.println(ans.val);
                    ans.next=new ListNode();
                    ans=ans.next;
                    head1=head1.next;
                }
                else{
                    ans.val=head2.val;
                    System.out.println(ans.val);
                    ans.next=new ListNode();
                    ans=ans.next;
                    head2=head2.next;
                }
            }
            else{
                if(head1==null && head2 !=null){
                    ans.val=head2.val;
                    System.out.println(ans.val);
                    ans.next=new ListNode();
                    ans=ans.next;
                    head2=head2.next;
                }
                else if (head2 == null && head1 !=null){
                    ans.val=head1.val;
                    System.out.println(ans.val);
                    ans.next=new ListNode();
                    ans=ans.next;
                    head1=head1.next;
                }
            }
            
        }
        //remove the last 0
        ListNode sorted=headA;
        while(headA.next.next != null){
            headA=headA.next;
        }
        headA.next=null;
        return sorted;
        
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static void main(String[] args){
        ListNode l1=new ListNode(1);
        ListNode head1=l1;
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(5);


        ListNode l2=new ListNode(3);
        ListNode head2=l2;
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(5);
        MergeSorted obj=new MergeSorted();

       obj.mergeTwoLists(head1, head2);




    }
}

