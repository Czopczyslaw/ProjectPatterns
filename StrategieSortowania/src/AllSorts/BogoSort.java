package AllSorts;

import Strategy.Array;
import Strategy.SortStrategy;
import Strategy.TimeMeasure;

public class BogoSort extends TimeMeasure implements SortStrategy {
    @Override
    public long Sort(Array array) {
        Start();
        int counter=0;
        Integer[] arr = array.getArray();
        while(!isSorted(arr)){
            Shuffle(arr);
            counter++;
        }
        Stop();
        System.out.println();
        System.out.println("BogoSort po " + counter +" probach : ");
        array.setSortedArray(arr);
        array.showArray();
        array.showSortedArray();
        Measure();
        return getMeasurement();
    }
    private void Shuffle(Integer[] arr) {
        for(int x = 0; x < arr.length; ++x) {
            int index1 = (int) (Math.random() * arr.length),
                    index2 = (int) (Math.random() * arr.length);
            int a = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = a;
        }
    }
    private boolean isSorted(Integer[] arr) {
        for(int x = 0; x < arr.length - 1; ++x) {
            if(arr[x] > arr[x+1]) {
                return false;
            }
        }
        return true;
    }
}
