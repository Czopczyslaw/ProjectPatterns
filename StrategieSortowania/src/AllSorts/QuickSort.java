package AllSorts;
import Strategy.*;
import java.util.Arrays;
//Skoro java ma wbudowany Quicksort, to po co go pisac kolejny raz? :)
public class QuickSort extends TimeMeasure implements SortStrategy {
    @Override
    public long Sort(Array array) {
        Start();
        Integer[] arr = array.getArray();

        Arrays.sort(arr);

        Stop();
        System.out.println();
        System.out.println("QuickSort:");
        array.setSortedArray(arr);
        array.showArray();
        array.showSortedArray();
        Measure();
        return getMeasurement();
    }

}
