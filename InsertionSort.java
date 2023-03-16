import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public ArrayList<Integer> insertionSort(ArrayList<Integer> array){
        for(int j=1; j<array.size();j++){
            int key= array.get(j);
            int i=j-1;
            while(i>=0 && array.get(i)>key){
                array.set(i+1,array.get(i));
                i=i-1;
            }
            array.set(i+1,key);
        }
        return array;
    }
}
