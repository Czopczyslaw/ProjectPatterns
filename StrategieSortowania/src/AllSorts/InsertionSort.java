package AllSorts;
import Strategy.*;
public class InsertionSort extends TimeMeasure implements SortStrategy {
    @Override
    public void Sort(Array array) {
        Start();
        Integer[] arr = array.getArray();
        for (int i = 1; i < arr.length; i++)
        {
            int valueToSort = arr[i];
            int j;
            for ( j = i; j > 0 && arr[j - 1] > valueToSort; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = valueToSort;
        }
        Stop();
        System.out.println();
        System.out.println("InsertSort:");
        array.setSortedArray(arr);
        array.showArray();
        array.showSortedArray();
        Measure();
    }
}
