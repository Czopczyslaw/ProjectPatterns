package Automatization;

import AllSorts.*;
import Strategy.Array;
import Strategy.ArraySorter;

public class AutoTest {
    private ArraySorter arraySorter= new ArraySorter();
    private Array array;
    private long[][] timemean = new long[8][10];    //tablica sredniej czasu gdzie pierwsze [] oznacza ktora strategia, a drugie [] czas i-tego sortowania
    private int elementsNumber;

    //tworzy autotest z podana iloscia elementow w tablicy np sortowanie tablicy z 10 elementami
    public AutoTest(int elementsNumber) {
        this.elementsNumber = elementsNumber;
    }
    //tu dzieja sie rzeczy :)
    public void startTesting(){
        for (int choice = 0; choice < 8; choice++) { //petla ktora przechodzi przez wszystkie Sorty
            try{this.setArraySorter(choice+1);} catch (Exception e){System.out.println(e);} //ustawia ktora strategia ma teraz byc
            for(int times= 0;times<10;times++) {    //petla ktora sortuje i zwraca do tablicy czas sortowania
                array = new Array(elementsNumber);
                timemean[choice][times] = arraySorter.sortArray(array);
            }

        }

    }
    public void showTimeMean(){
        System.out.println();
        System.out.println("Dla "+ elementsNumber + " elementow");
        System.out.println("Dla BubbleSorta srednia czasu z 10 sortowan wynosi:        " + returnMean(0));
        System.out.println("Dla SelectionSorta srednia czasu z 10 sortowan wynosi:     " + returnMean(1));
        System.out.println("Dla QuickSorta srednia czasu z 10 sortowan wynosi:         " + returnMean(2));
        System.out.println("Dla ParallelQuickSorta srednia czasu z 10 sortowan wynosi: " + returnMean(3));
        System.out.println("Dla MergeSorta srednia czasu z 10 sortowan wynosi:         " + returnMean(4));
        System.out.println("Dla HeapSorta srednia czasu z 10 sortowan wynosi:          " + returnMean(5));
        System.out.println("Dla ShellSorta srednia czasu z 10 sortowan wynosi:         " + returnMean(6));
        System.out.println("Dla InsertionSorta srednia czasu z 10 sortowan wynosi:     " + returnMean(7));
    }
    //zwraca srednia z 10 wynikow
    private long returnMean(int whichSort){
        long temp=0;
        for(int i=0;i<10;i++){
            temp+=timemean[whichSort][i];
        }
        return temp/10;
    }
    //ustawia na dana strategie sortowania. Prywatne, bo testy mialy byc automatyczne, wiec z zewnatrz tego nei zmieniamy :)
    private void setArraySorter(int choice) throws Exception {
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
