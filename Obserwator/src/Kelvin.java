public class Kelvin implements Wyswietlacz {
    private CzujnikTemperatury ct = null;
    @Override
    public void Aktualizuj(Podmiot p) {
        if(p==ct)
        System.out.println("Temperatura w stopniach Kelvina: "+ (ct.wez()+273.15));
    }
    Kelvin(CzujnikTemperatury ct){
        this.ct = ct;
    }
}
