import java.util.*;
class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(checkrep(s,i,j)){
                    if(res < j-i+1)
                        res=j-i+1;
                }
            }
        } 
        return res;
    }
    
    public boolean checkrep(String s, int start, int end){
        int[] c=new int[128];
        for(int i=start; i<=end; i++){
            char curr=s.charAt(i);
            c[curr]++;
            if(c[curr]>1)
                return false;
        }
        return true;
    }

    public int slidingwindow(String s){
        int left=0; 
        int right=0;
        int max=0;
        HashSet<Character> letters =new HashSet();

        while(right < s.length()){

            if( ! letters.contains(s.charAt(right))){
                //char has not been seen before, increment the right pointer
                //add to the right
                letters.add(s.charAt(right));
                right++;
                max=Math.max(letters.size(), max);
            }
            else{
                //need to increase the left and remove the element
                //character is already seen, need to update the sliding window by updating our left
                letters.remove(s.charAt(left));
                left++;
            }

        }
        return max;



    }
}