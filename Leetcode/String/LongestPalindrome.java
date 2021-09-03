
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int max=0;
        String ans="";
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                String sub=s.substring(i, j+1);
                //send for checking
                if(isPlaindrome(sub)){
                    //it is!
                    if(max < sub.length()){
                        max=sub.length();
                        ans=sub;
                    }
                    
                }
                
                
            }
        }
        
        return ans;
    }
    
    public static boolean isPlaindrome(String s){
        int i=0; int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}