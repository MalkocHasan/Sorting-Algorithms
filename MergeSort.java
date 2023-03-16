import java.util.ArrayList;

public class MergeSort {
    public ArrayList<Integer> mergeSort(ArrayList<Integer> array){
       int n= array.size();
       if(n<=1) return array;
       int middle= n/2;
       ArrayList<Integer> leftArray = new ArrayList<>();
       for(int i=0;i<middle;i++){
           leftArray.add(array.get(i));
       }

       ArrayList<Integer> rightArray = new ArrayList<>();
       for(int i=middle;i<n;i++){
           rightArray.add(array.get(i));
       }

       leftArray=mergeSort(leftArray);
       rightArray=mergeSort(rightArray);
       return merge(leftArray,rightArray);

    }

    public ArrayList<Integer> merge(ArrayList<Integer> leftArray, ArrayList<Integer> rightArray){
        ArrayList<Integer> c = new ArrayList<>();
        int i=0,j=0,k=0;
        while((i<leftArray.size()) && (j<rightArray.size())){
            if(leftArray.get(i)<=rightArray.get(j)){
                c.add(leftArray.get(i++));
            }else{
                c.add(rightArray.get(j++));
            }
        }

        //remaining elements
        while(i< leftArray.size()){
            c.add(leftArray.get(i++));;
        }
        while(j< rightArray.size()){
            c.add(rightArray.get(j++));
        }
        return c;
    }
}
