
public class Strstr {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        int location=0;
        char cBfirst=B.charAt(0);
        boolean eq=false;
        //first letter in B

        //trivial cases
        if(A.length()< B.length()){
            return -1;
        }
        if(B.length()==0){
            return -1;
        }
        
        for(int i=0; i<A.length(); i++){
            char cA=A.charAt(i);
            if(cA==cBfirst){
                //need to check if the two strings are equal
                eq=checkifequal(A, B, i);
                if(eq){
                    location=i;
                }
                
            }
        }
        if(eq==true){
            return location;
        }
        else{
            return -1;
        }
    }

    public boolean checkifequal(String A, String B, int i){
        int k=0;
        //System.out.println();
        for(int j=i; j<A.length() && k<B.length(); j++,k++){   
              
            if(A.charAt(j)!=B.charAt(k)){
                return false;
            }
            //System.out.println(j+" "+A.charAt(j)+". "+k+" "+B.charAt(k));   
        }
        if(k==B.length()){
            return true;
        }
        else{
            return false;
        }
        
    }
}
