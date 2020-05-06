package Automatization;

import AllSorts.*;
import Strategy.Array;
import Strategy.ArraySorter;

public class AutoTest {
    private ArraySorter arraySorter= new ArraySorter();
    private Array array;
    private long[] timemean = new long[10];
    private int iterator;
    private int elementsNumber;

    public AutoTest(int elementsNumber) {
        this.elementsNumber = elementsNumber;
    }

    public void startTesting() {
        for (int i = 0; i < 10; i++) {
            array = new Array(elementsNumber);
            arraySorter.sortArray(array);
            //arraySorter.getTimeMeasurement()
        }
    }

    public void setArraySorter(int choice) throws Exception {
        if(choice==1) arraySorter.setSort(new BubbleSort());
        else if(choice==2) arraySorter.setSort(new SelectionSort());
        else if(choice==3) arraySorter.setSort(new QuickSort());
        else if(choice==4) arraySorter.setSort(new ParallelQuickSort());
        else if(choice==5) arraySorter.setSort(new MergeSort());
        else if(choice==6) arraySorter.setSort(new HeapSort());
        else if(choice==7) arraySorter.setSort(new ShellSort());
        else if(choice==8) arraySorter.setSort(new InsertionSort());
        else throw new Exception("zły wybór sortowania");
    }
}
