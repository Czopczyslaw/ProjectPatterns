package Strategy;

import Strategy.SortStrategy;

public class ArraySorter {
    private SortStrategy strategy;
    public void sortArray(Array array){
        strategy.Sort(array);
    }
    public void setSort(SortStrategy s){
        strategy=s;
    }
}
