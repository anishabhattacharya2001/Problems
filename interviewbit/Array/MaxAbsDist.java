import java.util.*;
import java.lang.*;

public class MaxAbsDist {

    private static int calculateDiff(int i, int j,
                                     int[] array)
    {
        // Utility function to calculate
        // the value of absolute difference
        // for the pair (i, j).
        int a=Math.abs(array[i] - array[j]) +Math.abs(i - j);
        System.out.println(a);
        return a;
        
    }
 
    // Function to return maximum absolute
    // difference in brute force.
    private static int maxDistance(int[] array)
    {
        // Variable for storing the maximum
        // absolute distance throughout the
        // traversal of loops.
        int result = 0;
 
        // Iterate through all pairs.
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i; j < array.length; j++)
            {
 
                // If the absolute difference of
                // current pair (i, j) is greater
                // than the maximum difference
                // calculated till now, update
                // the value of result.
                result = Math.max(result, calculateDiff(i, j, array));
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] A={1, 3, -1};
        System.out.println(maxDistance(A));
    }

}