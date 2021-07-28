
public class MaxDist {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        //this is O(n^2) which is not very good
        int max=0;
        for(int i=0; i< A.length; i++){
            for(int j=i+1; j< A.length; j++){
                if(A[i] <= A[j]){
                    if(max< (j-i)){
                        max=j-i;
                    }
                }
            }
        }
        return max;
    }
    


}