import java.util.ArrayList;
import java.util.Collections;

public class CountingSort {
    public ArrayList<Integer> countingSort(ArrayList<Integer> array,int k){
        ArrayList<Integer> output = new ArrayList<>();
        int max = Collections.max(array);
        ArrayList<Integer> count = new ArrayList<>();
        for(int i=0;i<=max;i++){
            count.add(0);
        }
        for(int i=0;i<k+1;i++){
            output.add(0);
        }
        for(int i=0;i<k;i++){
            int countIndex=array.get(i);
            count.set(countIndex,count.get(countIndex)+1);
        }
        for(int i=1;i<=max;i++){
            count.set(i,count.get(i)+count.get(i-1));
        }
        for(int i=k-1;i>=0;i--){
            int countIndex=array.get(i);
            output.set(count.get(array.get(i))-1,array.get(i));
            count.set(countIndex,count.get(countIndex)-1);
        }

        output.remove(output.size()-1);

        return output;
    }
}
