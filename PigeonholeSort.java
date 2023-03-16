import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class PigeonholeSort {
    public int getMinimum(ArrayList<Integer> array){
        int minimum = array.get(0);
        for (int i=1; i<array.size(); i++) {
            if (minimum > array.get(i))
                minimum = array.get(i);
        }
        return minimum;
    }
    public int getMaximum(ArrayList<Integer> array){
        int maximum = array.get(0);
        for (int i=1; i<array.size(); i++) {
            if (maximum < array.get(i))
                maximum = array.get(i);
        }
        return maximum;
    }
    public ArrayList<Integer> pigeonholeSort(ArrayList<Integer> array){
        int min = getMinimum(array);
        int max = getMaximum(array);
        int n = array.size();
        int range = max - min + 1;
        ArrayList<Integer> output = new ArrayList<Integer>();
        ArrayList<Integer> pholes = new ArrayList<Integer>();
        for (int i = 0; i < range; i++) {
            pholes.add(0);
        }

        for (int x : array) {
            pholes.set(x - min, pholes.get(x - min) + 1);
        }

        for (int i = 0; i < range; i++) {
            while (pholes.get(i) > 0) {
                pholes.set(i, pholes.get(i) - 1);
                output.add(i + min);
            }
        }
        return output;
    }
}
