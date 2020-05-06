import Fabryka.HTMLTagFactory;

import java.util.Scanner;

/*
Jak opisano w zadaniu dotyczącym wzorca Dekorator, w języku HTML każdy fragment tekstu może być na różne sposoby „otagowany”. Proszę napisać prosty program (może być konsola), który:

Pozwoli użytkownikowi na wprowadzenie jednolinijkowego tekstu.
Wyświetli proste menu zawierające wybrane znaczniki HTML (np. strong, p, em, mark), menu ma pozwolić użytkownikowi na jednokrotny wybór znacznika jakim ma być otoczony wcześniej wprowadzony tekst.
Wyprowadzi do strumienia wyjściowego tekst otoczony wybranym w menu znacznikiem.

Program ma zostać zaimplementowany z wykorzystaniem wzorca Prosta Fabryka lub Metod Fabrykująca.

Kod źródłowy (najlepiej kompletny projekt bez plików binarnych) rozwiązania proszę przesyłać w archiwum zip, 7z lub rar.
 */
public class Main {
    public static void main(String[] args) {
        HTMLTagFactory factory = new HTMLTagFactory();
        Scanner s = new Scanner(System.in);
        System.out.println("Wpisz jednolinijkowy tekst, ktory chcesz wpisac");
        String text = s.nextLine();
        System.out.println("Wybierz jeden tag, który ma być użyty:");
        System.out.println("1. Strong");
        System.out.println("2. EM");
        System.out.println("3. P");
        System.out.println("4. Mark");
        Integer choice = s.nextInt();
        factory.createTag(text, choice);
        //nie chcialo mi sie tworzyc tylu klas tagów jak przy dekoratorze :)
    }
}
