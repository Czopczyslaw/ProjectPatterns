public class Celsiusz implements Wyswietlacz {
    private CzujnikTemperatury ct = null;
    @Override
    public void Aktualizuj(Podmiot p) {
        if(p==ct)
    System.out.println("Temperatura w stopniach Celsiusza: "+ ct.wez());
    }
    Celsiusz(CzujnikTemperatury ct){
        this.ct = ct;
    }
}
