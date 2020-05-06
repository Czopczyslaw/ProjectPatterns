package Zadania.NJPO;
/*
*Zadanie - struktura książki jako kompozyt
* Karol Góźdź
* Grupa IO 1
*Jest tu kilka nieeleganckich rzeczy, jak niezafajna czytelność kodu (ale cale szczescie nie jest go duzo) i uzywanie polskich nazw, zamiast tak jak konwencja przykazuje angielskich.
*/


public class Main {

    public static void main(String[] args) {
        // W ten sposob, bo czemu nie? Taki trening dla mnie i mniej pisania kosztem czytelnosci.
        Biblioteka biblioteka = new Biblioteka("Fajna i Lokalna")
                .dodajGatunek(new Gatunek("Sci-Fi")
                        .dodajKsiazke(new Ksiazka("Jakies Sci-fi")
                                .dodajRozdzial(new Rozdzial("Pierwszy")
                                        .dodajPodrozdzial(new Podrozdzial("Intro")
                                                .dodajKolejnyPodrozdzial(new Podrozdzial("Intro intra"))
                                                .dodajKolejnyPodrozdzial(new Podrozdzial("Outro Intra")
                                                        .dodajKolejnyPodrozdzial(new Podrozdzial("da sie dalej")
                                                                .dodajKolejnyPodrozdzial(new Podrozdzial(" 'I tak w nieskonczonosc' :)")))))
                                        .dodajPodrozdzial(new Podrozdzial("Outro")
                                                .dodajKolejnyPodrozdzial(new Podrozdzial("Intro Outra"))
                                                .dodajKolejnyPodrozdzial(new Podrozdzial("Outro outra"))))
                                .dodajRozdzial(new Rozdzial("Drugi"))
                                .dodajRozdzial(new Rozdzial("Trzeci")
                                        .dodajPodrozdzial(new Podrozdzial("dodatkowy")))
                                .dodajRozdzial(new Rozdzial("Czwarty")
                                        .dodajPodrozdzial(new Podrozdzial("podrozdzial")
                                                .dodajKolejnyPodrozdzial(new Podrozdzial("kolejny ")))
                                        .dodajPodrozdzial(new Podrozdzial("podrozdzial kolejny")))))
                .dodajGatunek(new Gatunek("Fantasy")
                        .dodajKsiazke(new Ksiazka("Hobbit"))
                .dodajKsiazke(new Ksiazka("Komunizm i Feminizm")
                        .dodajRozdzial(new Rozdzial("Pierwszy"))
                        .dodajRozdzial(new Rozdzial("Drugi")
                                .dodajPodrozdzial(new Podrozdzial("Pierwszy")
                                    .dodajKolejnyPodrozdzial(new Podrozdzial("Kolejny"))
                                    .dodajKolejnyPodrozdzial(new Podrozdzial("Jeszcze jeden")))
                                .dodajPodrozdzial(new Podrozdzial("Drugi")))
                        .dodajRozdzial(new Rozdzial("Koncowy"))));



        biblioteka.Indexuj();   //jest wyjasnione w klasie JednostkaStruktury
        biblioteka.wypiszDane();
    }
}

