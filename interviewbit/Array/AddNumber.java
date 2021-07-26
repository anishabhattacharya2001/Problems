import java.util.*;
import java.lang.Math;
public class AddNumber{

    public static int[] addanytonumber(int[] A, int B){

        int[] sol=new int[A.length+1];
        //+1 is in case of a carryover
        int pA=A.length-1; //p for A
        int pS=sol.length-1; //p for solution
        int place=1;
        //place means units place, tenths place etc..
        int add=B%((int)Math.pow(10,place));

        int ans= A[pA]+add;
        sol[pS]=ans%10;
        int carry=ans/10;
        //units place is taken care of
        pS--;
        pA--;
        place++;

        while( pA>=0 ){
            add=B%((int)Math.pow(10,place));
            ans= A[pA]+add+carry;
            sol[pS]=ans%10;
            carry=ans/10;
            pS--;
            pA--;
            place++;
        }
        if(carry !=0){
            sol[pS]= carry;
            return sol;
        }
        return sol;



    }


    public static int[] addonetonumber(int[] A){
        A=removeleadingzeros(A);
        System.out.println( Arrays.toString( A ));
        int[] sol=new int[A.length+1];
        //+1 is in case of a carryover
        int pA=A.length-1; //p for A
        int pS=sol.length-1; //p for solution

        int ans= A[pA]+1;
        sol[pS]=ans%10;
        int carry=ans/10;
        //units place is taken care of
        pS--;
        pA--;
        
        //start checking from the second to last digit
        while( pA>=0 ){
            ans= A[pA]+carry;
            sol[pS]=ans%10;
            carry=ans/10;
            pS--;
            pA--;
        }

        if(carry == 1){
            sol[pS]= 1;
            return sol;
        }
        else{
            return removeFirstElement(sol);
        }

    }
    public static int[] removeleadingzeros(int[] A){
        if(A.length==1){
            return A;
        }
        //first find real size of the arry
        int leadingZ=0;
        for(int i=0; i< A.length; i++){
            if(A[i]==0){
                leadingZ++;
            }
            else{
                break;
            }
        }
        //System.out.println("leadingZ"+leadingZ);
        //remove the leading zeros
        int size=A.length-leadingZ;
        System.out.println("Size"+size);
        int[] newA=new int[size];
        int i=0;
        int j=leadingZ;
        while(i<newA.length && j<A.length){
            newA[i]=A[j];
            //System.out.println("newA[ "+i+" ] is "+ newA[i]+ "= A[ "+j+" ] is "+A[j]);
            i++;
            j++;
        }

        return newA;


    }

    public static int[] removeFirstElement(int[] sol){
        int[] updatedsol=new int[sol.length-1];
        int i=1;
        int j=0;

        while(j<updatedsol.length && i<sol.length){
            updatedsol[j]=sol[i];
            //System.out.println("updatedsol[ "+j+" ] is "+ updatedsol[j]+ "= sol[ "+i+" ] is "+sol[i]);
            i++;
            j++;
        }
        return updatedsol;
    }


    public static void main(String[] args){
        int[] A={ 1,2,3 };
        //System.out.println( Arrays.toString( addonetonumber(A)  ));
        System.out.println( Arrays.toString( addanytonumber(A, 22))  );
       

    }
}