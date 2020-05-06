package AllSorts;
import Strategy.*;
import java.util.Arrays;
//Skoro java ma wbudowany Quicksort, to po co go pisac kolejny raz? :)
//A skoro ma też rozrzucenie sortowania na wątki, to czemu tego nie użyc?
public class ParallelQuickSort extends TimeMeasure implements SortStrategy {
    @Override
    public void Sort(Array array) {
        Start();
        Integer[] arr = array.getArray();

        Arrays.parallelSort(arr);

        Stop();
        System.out.println();
        System.out.println("QuickSort:");
        array.setSortedArray(arr);
        array.showArray();
        array.showSortedArray();
        Measure();
    }

}
