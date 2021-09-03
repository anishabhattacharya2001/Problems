import java.util.*;

public class NearestSmallestElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {

        Stack <Integer> st=new Stack<Integer>();
        st.push(A.get(0));

        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(-1);
        for(int i=1; i<A.size(); i++){
            while(!st.isEmpty() && st.peek()>=A.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(st.peek());
            }

            st.push(A.get(i));
            
        }
        return ans;
    }
}
