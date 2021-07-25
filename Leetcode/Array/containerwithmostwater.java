import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                //length is the lower value of height[i] and height[j]
                int length= (height[i]<=height[j])? height[i]:height[j];
                int breadth=j-i;
                int a=length*breadth;
                if(maxarea<a){
                    maxarea=a;
                }
            }
            
        }    
        return maxarea;   
    }

    public int maxArea2(int[] height){
        int maxarea=0;
        int i=0;
        int j=height.length-1;
        //the fartest points away from each other and keep moving the pointer based on which value is smaller
        //loop should end when they meet
        while(i<j){
            //length is the shorter of the two
            int length=(height[i]<height[j])? height[i]:height[j];
            int breadth=j-i;
            int a=length*breadth;
            if(maxarea<a){
                maxarea=a;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return maxarea;
    }
}