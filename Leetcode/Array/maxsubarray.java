import java.lang.*;

class Solution {
    public int maxSubArray1(int[] nums) {
        int maxsum=nums[0];
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i+1; j<nums.length; j++){
                if(maxsum<sum){
                    maxsum=sum;
                }
                sum=sum+nums[j];
            }
        }
        return maxsum;
    }
    public int kadaneSol(int[] nums){

        int currentMax=nums[0];
        int globalMax=nums[0];

        for(int i=1; i<nums.length; i++){

            //currentMax is supposed to be nums[i] or nums[i]+currentMax
            currentMax= Math.max(nums[i], nums[i]+currentMax);

            if(currentMax > globalMax){
                globalMax= currentMax;
            }
        }

        return globalMax;


    }
}