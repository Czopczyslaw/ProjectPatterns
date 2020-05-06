/*
Tablice można sortować różnymi metodami. W bibliotekach większości języków zaimplementowane są szybkie algorytmy sortowania.
Jakie są jednak rzeczywiste różnice pomiędzy tzw. prostymi algorytmami sortowania a np. algorytmem sortowania szybkiego?
Proszę napisać program, który pozwoli na przeprowadzenie zautomatyzowanych eksperymentów pozwalających sprawdzić efektywność sortowania.
Program przeprowadzić automatyczne testy, polegające na utworzeniu tablicy, zapełnieniu jej losowymi danymi, oraz posortowaniu jej różnymi metodami (pomiar czasu).
Proszę utworzyć tablice o: kilkudziesięciu elementach, kilkuset elementach, kilku tysiącach elementów (może uda się dla większego rozmiaru).
Sortowanie każdą metodą mam być powtórzone 10 razy a wyniku uśrednione.
Proszę przetestować dwie proste metody sortowania (np. bąbelkowe, proste wybieranie), sortowanie szybkie oraz sortowanie dostępne w bibliotekach wybranego języka.
Uwaga: program jest prosty, wiem, że mało ciekawy. Ale on ma być poligonem doświadczalnym dla przećwiczenia stosowania wzorców projektowych.

Kod źródłowy (najlepiej kompletny projekt bez plików binarnych) rozwiązania proszę przesyłać w archiwum zip, 7z lub rar.
*/

import AllSorts.*;
import Strategy.*;

public class Main {
    public static void main(String[] args) {
        Array x = new Array(1000);

        ArraySorter as = new ArraySorter();

        as.setSort(new SelectionSort());
        as.sortArray(x);
        as.setSort(new BubbleSort());
        as.sortArray(x);
        as.setSort(new InsertionSort());
        as.sortArray(x);
        as.setSort(new HeapSort());
        as.sortArray(x);
        as.setSort(new QuickSort());
        as.sortArray(x);
        as.setSort(new MergeSort());
        as.sortArray(x);
        as.setSort(new ParallelQuickSort());
        as.sortArray(x);
        as.setSort(new ShellSort());
        as.sortArray(x);

    }
}
