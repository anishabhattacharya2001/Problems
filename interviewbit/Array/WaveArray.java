
public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);

        for(int i=0; i<A.size()-1; i++){
            int temp=A.get(i+1);
            A.set(i+1, A.get(i));
            A.set(i, temp);
            i++;
        }

        return A;

    }
}