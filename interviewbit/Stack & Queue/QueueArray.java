
public class QueueArray {
    int[] A=new int[10];
    int front=-1;
    int rear=-1;

    public boolean isEmpty(){
        if(front== -1 && rear ==-1 ){
            return true;
        }
        return false;
    }

    public void enqueue(int x){
        //reach the end
        if(front == A.length-1){
            return;
        }
        else if(front== -1 && rear ==-1 ){
            //no elements present
            front=rear=0;
        }
        else{
            front ++;
        }
        A[front]=x;
    }

    public void dequeue(){
        //remove from the front
        //if empty
        if(isEmpty()){
            return ;
        }
        else{
            front =front+1;
        }
    }
}