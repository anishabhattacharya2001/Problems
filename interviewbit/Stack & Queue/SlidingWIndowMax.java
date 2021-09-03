import java.util.*;
public class SlidingWIndowMax {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        int max;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0; i<=A.size()-B; i++){
            max=A.get(i);
            for(int j=1; j<B; j++){
                if(A.get(i+j)>max){
                    max=A.get(i+j);
                }
            }
            ans.add(max);


        }
        return ans;

    }

    public ArrayList<Integer> slidingMaximumPQ(final List<Integer> A, int B) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(
            Collections.reverseOrder());
 
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
 
        for (; i < B; i++)
            queue.add(A.get(i));
 
        // adding the maximum element among first B elements
        res.add(queue.peek());
 
        // removing the first element of the array
        queue.remove(A.get(0));
 
        // iterarting for the next elements
        for (; i < A.size(); i++) {
 
            // adding the new element in the window
            queue.add(A.get(i));
 
            // finding & adding the max element in the
            // current sliding window
            res.add(queue.peek());
 
            // finally removing the first element from front
            // end of queue
            queue.remove(A.get(i - B + 1));
        }
 
        return res;

    }
}
