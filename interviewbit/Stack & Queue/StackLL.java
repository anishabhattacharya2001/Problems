
public class StackLL {

    public class Node{
        int val;
        Node next;      
    }
    Node top=null;
    public void push(int x){
        //create temp with the value x and next Node as top
        //top will be updated to the topmost value
        Node temp=new Node();
        temp.val=x;
        temp.next=top;
        top=temp;
    }
    public void pop(){
        //need to remove top
        if(isEmpty()){
            return;
        }
        else{
            top=top.next;
        }
    }
    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }

}