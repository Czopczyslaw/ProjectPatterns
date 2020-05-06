import java.util.ArrayList;

public class Podmiot {
protected ArrayList<Wyswietlacz> wyswietlacze = new ArrayList<>();
public void dodajWyswietlacz(Wyswietlacz w){
    wyswietlacze.add(w);
}
public boolean usunWyswietlacz(Wyswietlacz w){
    return wyswietlacze.remove(w);
}
public void usunWyswietlacze(){
    wyswietlacze.clear();
}
public void powiadomWyswietlacz(){
    for(Wyswietlacz w:wyswietlacze){
        w.Aktualizuj(this);
    }
}
}
