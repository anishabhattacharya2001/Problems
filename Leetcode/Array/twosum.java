
import java.io.*;
import java.util.*;
class twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] array=new int[2];
        HashMap <Integer, Integer> map=new HashMap<Integer, Integer>();
        //key is (target-value) at position i and value is i
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }

        for(int i=0; i<nums.length; i++){
            int c=target-nums[i];
            if(map.containsKey(c) && map.get(c) !=i){
                array[0]=map.get(c);
                array[1]=i;
            }
        }
        return array;
    }
}