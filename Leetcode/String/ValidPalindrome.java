import java.util.*;
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String ans=wordupdated(s);
        int i=0; 
        int j=ans.length()-1;
        
        while(i<j){
            if(ans.charAt(i)== ans.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
        
    }
    public String wordupdated(String s){
        String ans="";
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                ans=ans+(c+"");
            }
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    c=Character.toLowerCase(c);
                }
                ans=ans+(c+"");
            }
        }
        System.out.println(ans);
        return ans;
    }
}