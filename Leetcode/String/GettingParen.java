
public class GettingParen {
    public List<String> generateParenthesis(int n) {
        
        List<String> paren=new ArrayList<String>();
        
        gettingParenthesis(paren, n, 0, 0, "");
        
        return paren;
        
    }
    
    public void gettingParenthesis(List<String> paren, int n, int lp, int rp, String s){
        
        //what is my choice? place ( or )
        //what is my condition? have to make sure lp and rp do not exceed their values
        //finish goal? need to have 2*n length of string
        
        if( lp == n && rp == n){
            paren.add(s);
            return;
        }
        
        if( lp < n){
            gettingParenthesis(paren, n, lp+1, rp, s+"(");
        }
        
        if( rp < lp){
            gettingParenthesis(paren, n, lp, rp+1, s+")");
        }
        
    }
}