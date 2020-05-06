package AllSorts;
import Strategy.*;
public class BubbleSort extends TimeMeasure implements SortStrategy {
    @Override
    public void Sort(Array array) {
        Start();
        Integer[] arr = array.getArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        Stop();
        System.out.println();
        System.out.println("BubbleSort:");
        array.setSortedArray(arr);
        array.showArray();
        array.showSortedArray();
        Measure();

    }
}
