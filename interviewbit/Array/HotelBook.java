
public class HotelBook {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        //find the maximum departue day
        int max=0;
        for(int i=0; i<depart.size(); i++){
            if(max<depart.get(i)){
                max=depart.get(i);
            }
        }


        int[] occupuancy=new int[max+1];
        for(int index=0; index<arrive.size(); index++){
            occupuancy[arrive.get(index)]+=1;
            occupuancy[depart.get(index)]-=1;
        }
        int runningsum=0;
        for(int i=0; i<occupuancy.length; i++){
            runningsum+=occupuancy[i];
            if(runningsum > K){
                return false;
            }
            
        }
        return true;

    }
}
