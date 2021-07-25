import java.util.*;

public class RemoveDuplicates {
    public int removeDuplicates(ArrayList<Integer> a) {

        int p1=0;
        int p2=0;
        int len=0;

        while(p1<a.size() && p2<a.size()){
            if(a.get(p1) == a.get(p2)){         
                p2++;              
            }
            else if(a.get(p2) > a.get(p1)){
                a.set(p1+1, a.get(p2));
                p1++;
                len++;

            }
        }
        int c=a.size()-1;
        //remove all the elements that are outside
        while(c<=len-1){
            a.remove(c);
            c--;
        }

        return len;

    }
    public static void main(String[] args){

        int[] a={1,1,1,2,2,2,3,3,4,5};
        


    }
}