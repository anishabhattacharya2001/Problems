class Solution {
    public int[] productExceptSelf(int[] nums) {
        
         int[] leftp=new int[nums.length];
        int[] rightp=new int[nums.length];
        
        leftp[0]=1;
        rightp[nums.length-1]=1;
        for(int i=0; i<nums.length-1; i++){
            leftp[i+1]=leftp[i]*nums[i];
        }
        for(int i=nums.length-1; i>0; i--){
            rightp[i-1]=rightp[i]*nums[i];
        }
        
        //get result
        int[] ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=leftp[i]*rightp[i];
        }
        return ans;
    }
}