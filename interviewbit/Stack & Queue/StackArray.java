
public class StackArray {
    int[] arr=new int[10];
    int top=-1;

    public void push(int x){
        top=top+1;
        arr[top]=x;
    }
    public void pop(){
        top--;
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        if(top<=-1)
            return true;

        return false;
    }
}