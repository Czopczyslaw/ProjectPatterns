package Zadania.NJPO;

import java.util.ArrayList;

public abstract class JednostkaStruktury {
    protected String nazwa;
    protected String typ;
    protected String wypisanie;         //tutaj string ktory jest do wypisywania indeksow np 1.2.1.
    protected Integer indexRodzica = 0;
    protected Integer indexWlasny = 0;
    protected Integer wciecia;          //ile ma byc wciec do wypisania
    protected ArrayList<JednostkaStruktury> podobiekty = new ArrayList<>();

    public JednostkaStruktury(String nazwa, String typ) {
        this.nazwa = nazwa;
        this.typ = typ;
    }
    // settery w szablonie "builder" po to, zeby mozna bylo bez deklarowania zmiennych po kropce dodawac kolejne obiekty do biblioteki. Czyli ksiazki, rozdzialy i tak dalej.
    // Bez tego, moznaby tylko sekwencyjnie po jednej sztuce dodac, zamiast po 3 rozdzialy do ksiazki
    public JednostkaStruktury setIndexRodzica(Integer indexRodzica) {
        this.indexRodzica = indexRodzica;
        return this;
    }

    public JednostkaStruktury setIndexWlasny(Integer indexWlasny) {
        this.indexWlasny = indexWlasny;
        return this;
    }

    public JednostkaStruktury setWciecia(Integer wciecia) {
        this.wciecia = wciecia + 1;
        return this;
    }
    public JednostkaStruktury setWypisanie(String wypisanie){
        if(wypisanie==null||wciecia<4) this.wypisanie=indexWlasny.toString(); //wciecia<4 bo nie trzeba indeksowac ksiazek.
        else  this.wypisanie=wypisanie+"."+indexWlasny;
        return this;
    }

    //metoda jest do rekurencyjnego przejscia przez wszystkie listy i nadania im indeksow wedlug ich pozycji na ArrayLiscie.
    //Zamiast zrobic to poprawnie, by te indeksy byly przekazywane przy konstruktorze klasy, zrobilem to w taki sposob. Zaleta jest to, ze przy modyfikacji biblioteki, to poprawi jej indeksy
    //Chcialem tez w ten sposob, bo chcialem przecwiczyc wyrazenia lambda :)
    public JednostkaStruktury Indexuj() {
        if (this.podobiekty.size() != 0) {
            this.podobiekty.forEach(podobiekt -> {
                        podobiekt.setIndexRodzica(this.indexWlasny);
                        podobiekt.setIndexWlasny(this.podobiekty.indexOf(podobiekt) + 1);   //zeby zaczynalo sie od 1, zamiast od 0
                        podobiekt.setWciecia(this.wciecia);
                        podobiekt.setWypisanie(this.wypisanie);
                        podobiekt.Indexuj();
                    }
            );
        }
        return this;
    }
    //rekurencyjne przejscie przez listy i najpierw wypisanie w petli ile powinno byc wciec w linii dla zobrazowania hierarchii a potem wypisanie indeksow, typu kompozytu i nazwy.
    public void wypiszDane() {
        System.out.println();
        for (int i = 0; i < this.wciecia; i++) {
            System.out.print("  ");
        }
        System.out.print(wypisanie+". "+typ+" "+ nazwa);
        for (JednostkaStruktury js : podobiekty) {
            js.wypiszDane();
        }
    }
}

