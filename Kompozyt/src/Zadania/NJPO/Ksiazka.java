package Zadania.NJPO;


public class Ksiazka extends JednostkaStruktury {
    public Ksiazka(String nazwa){
        super(nazwa,"Ksiazka");
    }

    public Ksiazka dodajRozdzial(JednostkaStruktury rozdzial){
    podobiekty.add(rozdzial);
    return this;
    }
    @Override       //override poniewaz ksiazka takze ma nie miec indeksowania
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
