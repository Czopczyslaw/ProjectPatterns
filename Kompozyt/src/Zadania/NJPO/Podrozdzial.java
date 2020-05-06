package Zadania.NJPO;


public class Podrozdzial extends JednostkaStruktury {
    public Podrozdzial(String nazwa) {
        super(nazwa, "Podrozdzial");
    }

    public Podrozdzial dodajKolejnyPodrozdzial(Podrozdzial podrozdzial) {
        podobiekty.add(podrozdzial);
        return this;
    }



}
