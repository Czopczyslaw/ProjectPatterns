/*
Załóżmy, że istnieje klasa CzujnikTemperatury, posiadająca prywatne pole temperatura, przechowujące zarejestrowaną wartość temperatury zapisaną w stopniach Celsiusza.
Załóżmy również, że klasa posiada metodę ustaw(nowaWartość) pozwalającą na zmianę wartości temperatury.
Wartość temperatury pokazują trzy programowe wyświetlacze, reagując na każdą zmianę temperatury spowodowaną wywołaniem metody ustaw obiektu klasy CzujnikTemperatury.
Każdy z wyświetlaczy pokazuje temperaturę w innej skali temperatur: Celsiusza, Kelvina i Fahrenheit’a.
Proszę zidentyfikować jaki wzorzec projektowy dobrze opisuje przedstawioną sytuację oraz napisać prosty program demonstracyjny implementujący zidentyfikowany wzorzec.

Kod źródłowy (najlepiej kompletny projekt bez plików binarnych) rozwiązania proszę przesyłać w archiwum zip, 7z lub rar.
 */
public class Main {
    public static void main(String[] args){
        CzujnikTemperatury ct = new CzujnikTemperatury(13.0);
        Celsiusz C = new Celsiusz(ct);
        Kelvin K = new Kelvin(ct);
        Fahrenheit F = new Fahrenheit(ct);

        ct.dodajWyswietlacz(C);
        ct.dodajWyswietlacz(K);
        ct.dodajWyswietlacz(F);

        ct.ustaw(-17.7777777777777778);
        System.out.println();
        ct.ustaw(0.0);
        System.out.println();
        ct.ustaw(-273.15);
    }
}
