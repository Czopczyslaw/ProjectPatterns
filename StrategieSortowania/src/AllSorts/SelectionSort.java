package AllSorts;
import Strategy.*;
public class SelectionSort extends TimeMeasure implements SortStrategy {
    @Override
    public long Sort(Array array) {
        Start();
        Integer[] arr = array.getArray();
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        Stop();
        System.out.println();
        System.out.println("SelectionSort:");
        array.setSortedArray(arr);
        array.showArray();
        array.showSortedArray();
        Measure();
        return getMeasurement();
    }
}
