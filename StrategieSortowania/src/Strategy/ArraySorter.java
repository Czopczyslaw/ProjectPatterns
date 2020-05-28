package Strategy;

import Strategy.SortStrategy;

public class ArraySorter {
    private SortStrategy strategy;
    public long sortArray(Array array){ //long, bo trzeba jeszcze wyzej przekazac czas sortowania
        return strategy.Sort(array);
    }
    public void setSort(SortStrategy s){
        strategy=s;
    }

}
