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

import AllSorts.BogoSort;
import Automatization.AutoTest;
import Strategy.Array;
import Strategy.ArraySorter;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        AutoTest at1 = new AutoTest(96);     //kilkadziesiat elementow
        AutoTest at2 = new AutoTest(420);    //kilkaset elementow
        AutoTest at3 = new AutoTest(2137);    //kilka tysiecy elementow
        AutoTest at4 = new AutoTest(71830);    //kilkadziesiat tysiecy elementow
        at1.startTesting();
        at2.startTesting();
        at3.startTesting();
        at4.startTesting();
        System.out.println("Skonczono sortowanie");
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}

        at1.showTimeMean();
        at2.showTimeMean();
        at3.showTimeMean();
        at4.showTimeMean();
        System.out.println();
        System.out.println("Dla żartu, mozemy jeszcze sprobowac BogoSortu dla 10 elementow :) Wcisnij Enter...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
        //<bogosort>
        Array x = new Array(10);
        ArraySorter as = new ArraySorter();
        as.setSort(new BogoSort());
        as.sortArray(x);
        //</bogosort>
        }
}
