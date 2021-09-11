
public class Add1toNum {
    public int[] plusOne(int[] A) {
        //reverse
        //can I reverse an array without any extra space
        A=removeLeading0(A);
        A=reverse(A);

        int carry=1;

        for(int i=0; i<A.length; i++){
            int add = A[i]+carry;

            if(add>=10){
                carry=1;
                A[i]=add%10;         
            }
            else{
                A[i]=add;
                carry=0;
            }
        }

        if(carry==1){
            //need to add another element
            int[] b=new int[A.length+1];
            int i=0;
            for(; i<A.length; i++){
                b[i]=A[i];
            }
            b[i]=1;
            b= reverse(b);
            return b;
        }

        
        A=reverse(A);
        return A;



    }

    public int[] reverse(int[] A){
        int j=0;
        for(int i=A.length-1; i>=A.length/2; i--){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            j++;
        }
        return A;
    }

    public int[] removeLeading0(int[] A){
        if(A[0]!=0){
            return A;
        }
        int noZ=0;
        for(int i=0; i<A.length; i++){
            if(A[i]==0){
                continue;
            }
            else{
                noZ=i;
                break;
            }
        }
        int[] b=new int[A.length-noZ];
        int index=0;
        for(int i=noZ; i<A.length;i++){
            b[index]=A[i];
            index++;
        }
        return b;
    }
}