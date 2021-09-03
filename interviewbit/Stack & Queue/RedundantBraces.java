
public class RedundantBraces {
    public int braces(String A) {
        //ignore anything but the braces
        Stack <Character> stack=new Stack <Character>();
        for(char c: A.toCharArray()){

            if(c=='(' || c=='+' || c=='-' || c=='*' || c=='/'){
                stack.push(c);
            }
            else if(c==')'){
                //have to pop till we see the corresponding (
                    if(stack.peek()=='('){
                        return 1;
                    }
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();//remove the (
                    
            }
            
            
        }

        return 0;
    }
}