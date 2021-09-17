
public class Multiply {
    public String multiply(String num1, String num2) {
        
        int numA=stringtoint(num1);
        int numB=stringtoint(num2);
        int ans=numA*numB;
        return ans+"";
        
    }
    
    public static int stringtoint(String s){
        int num=0;
        boolean flag=false;
        for(int i=0; i<s.length(); i++){
            char curr=s.charAt(i);
            if(i==0 && curr=='-'){
                flag=true;
                continue;
            }
            num*=10;
            num+= (curr-'0');
        }
        
        if(flag==true){
            return num;
        }
        else{
            return (0-num);
        }
    }
}