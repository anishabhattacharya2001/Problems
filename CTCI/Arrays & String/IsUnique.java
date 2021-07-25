public class IsUnique{
    public boolean stringisunique(String s){
        int[] check= new int[128];
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            check[c]++;
            if(check[c]>1){
                return false;
            }

        }
        return true;
    }
}