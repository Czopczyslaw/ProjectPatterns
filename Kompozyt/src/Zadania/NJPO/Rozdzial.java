package Zadania.NJPO;


public class Rozdzial extends JednostkaStruktury {
    public Rozdzial(String ktory) {
        super(ktory, "Rozdzial");
    }

    public Rozdzial dodajPodrozdzial(JednostkaStruktury podrozdzial) {
        podobiekty.add(podrozdzial);
        return this;
    }


}
