package Zadania.NJPO;


public class Gatunek extends JednostkaStruktury {
    public Gatunek(String nazwa) {
        super(nazwa, "Gatunek");
    }

    public Gatunek dodajKsiazke(JednostkaStruktury ksiazka) {
        podobiekty.add(ksiazka);
        return this;
    }

    @Override   //override poniewaz gatunek ma nie miec indeksowania
    public void wypiszDane() {
        System.out.println();
        for (int i = 0; i < this.wciecia; i++) {
            System.out.print(" ");
        }
        System.out.print(typ + ": " + nazwa);
        for (JednostkaStruktury js : podobiekty) {
            js.wypiszDane();
        }
    }

}
