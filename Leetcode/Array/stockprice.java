import java.util.*;
class Solution {
     public int maxProfit1(int[] prices) {
         //this approach will give O(n^2)
         //maxprofit will keep track of the maximum difference and best profit
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                int profit=prices[j]-prices[i];
                if(maxprofit<profit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;      
    }

    public int maxProfit2(int[] prices) {
        //this approach will be O(n)
        int minprice=prices[0];
        int maxprofit=0;
        //find the minimum value possible while traversing the array
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minprice){
                minprice=prices[i];
                //the most current min price possible
            }
            //now we need to find the difference between the minprice and current value
            else if(prices[i]-minprice>maxprofit){
                maxprofit=prices[i]-minprice;
            }
        }
        return maxprofit;

    }

    

    public static void main(String []args){
        int[] array={1,2,3,4,5};
        //System.out.println("maxprofit is "+maxProfit(array));
    }
}