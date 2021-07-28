import java.util.*;
public class LargestNo{
    public static String largestNumber(final int[] A) {
        
        for(int i=0; i< A.length-1;i++ ){
            for(int j=i+1; j< A.length; j++){


                if(i != j){
                    //compare ansnow for i and j values
                    String a= A[i]+"";
                    String b= A[j]+"";

                   if(comparetwovalues(a, b) < 0){
                        //have to swap values
                        int ni=A[i];
                        A[i]=A[j];
                        A[j]=ni;
                    }               

                }

            }
        }

        String ans="";
        for(int i=0; i< A.length; i++){
            ans+=A[i]+"";
        }

        return ans;


    }

    public static int comparetwovalues(String a, String b){
        String c=a+b;
        String d=b+a;
        if( Integer.parseInt(c) > Integer.parseInt(d) ){
            return 1;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args){
        int[] A={ 3, 30,34,9};
        System.out.println(largestNumber(A));
    }



}