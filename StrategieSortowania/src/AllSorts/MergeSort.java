package AllSorts;
import Strategy.*;
public class MergeSort extends TimeMeasure implements SortStrategy {
        static Integer[] arr = null;
    @Override
    public long Sort(Array array) {
        Start();
        arr = array.getArray();
        mergeSort(0,arr.length-1); //tu jest wykonywany kod sortowania
        Stop();
        System.out.println();
        System.out.println("MergeSort:");
        array.setSortedArray(arr);
        array.showArray();
        array.showSortedArray();
        Measure();
        return getMeasurement();
    }
    public static void mergeSort(int start,int end)
    {
        int mid=(start+end)/2;
        if(start<end)
        {
            // Sort left half
            mergeSort(start,mid);
            // Sort right half
            mergeSort(mid+1,end);
            // Merge left and right half
            merge(start,mid,end);
        }

    }


    private static void merge(int start, int mid, int end) {
        // Initializing temp array and index
        int[] tempArray=new int[arr.length];
        int tempArrayIndex=start;
        int startIndex=start;
        int midIndex=mid+1;

        // It will iterate until smaller list reaches to the end
        while(startIndex<=mid && midIndex<=end)
        {
            if(arr[startIndex]< arr[midIndex])
            {
                tempArray[tempArrayIndex++]=arr[startIndex++];
            }
            else
            {
                tempArray[tempArrayIndex++]=arr[midIndex++];
            }
        }

        // Copy remaining elements
        while(startIndex<=mid)
        {
            tempArray[tempArrayIndex++]=arr[startIndex++];
        }
        while(midIndex<=end)
        {
            tempArray[tempArrayIndex++]=arr[midIndex++];
        }

        // Copy tempArray to actual array after sorting
        for (int i = start; i <=end; i++) {
            arr[i]=tempArray[i];
        }
    }
}
