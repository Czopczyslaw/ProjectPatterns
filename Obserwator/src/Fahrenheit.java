public class Fahrenheit implements Wyswietlacz {
    private CzujnikTemperatury ct = null;
    @Override
    public void Aktualizuj(Podmiot p) {
        if(p==ct)
        System.out.println("Temperatura w stopniach Fahrenheit: "+ ((ct.wez()*1.8)+32));
    }
    Fahrenheit(CzujnikTemperatury ct){
        this.ct = ct;
    }
}
