package Zadania.NJPO;

public class Biblioteka extends JednostkaStruktury { // bo czemu by nie isc jeszcze dalej :)
    public Biblioteka(String nazwa) {
        super(nazwa, "Biblioteka");
        this.wciecia = 0;
    }

    public Biblioteka dodajGatunek(JednostkaStruktury gatunek) {
        podobiekty.add(gatunek);
        return this;
    }

    @Override       //override poniewaz biblioteka ma nie miec indeksowania ani wciec
    public void wypiszDane() {
        System.out.println(typ + ": " + nazwa);
        for (JednostkaStruktury js : podobiekty) {
            js.wypiszDane();
        }
    }

}

