
public class Cycle {
    public class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        
        if(head==null){
            return false;
        }
        
        ListNode curr= head;
        //keep track of the current node
        HashMap<Integer, Integer> store=new HashMap<Integer, Integer>();
        //index, value
        int i=0;
        
        while(curr.next !=null){
            
            if(store.containsValue(curr.val)){
                //System.out.println(curr.val);
                return true;
                
            }
            System.out.println(curr.val+ "  "+i);
            store.put(i,curr.val);
            i++;
            curr=curr.next;
            
        }
        return false;
    }

    //modify the ListNodes to have a 'flag'
    public class MListNode {
        int val;
        MListNode next;
        int flag=0;
        public MListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycleNoextra(MListNode head){

        MListNode curr= head;

        while(curr.next != null){
            if(curr.flag !=0){
                return true;
            }
            curr.flag=1;
            curr=curr.next;
        }

        return false;

    }

    public boolean hasCycleFloydAlgo(ListNode head){
        ListNode slowp=head;
        ListNode fastp=head;

        while(slowp != null && fastp !=null && fastp.next != null){
            if(slowp.val == fastp.val){
                return true;
            }
            slowp=slowp.next;
            fastp=fastp.next.next;

        }

        return false;
    }





}