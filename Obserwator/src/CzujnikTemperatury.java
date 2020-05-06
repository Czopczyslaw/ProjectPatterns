public class CzujnikTemperatury extends Podmiot {
    private Double temperatura; //wartosc temperatury zapisana w stopniach Celsiusza
    public CzujnikTemperatury(Double temperatura){
    this.temperatura=temperatura;
    }
    public void ustaw(Double nowaWartosc){
        this.temperatura=nowaWartosc;
        powiadomWyswietlacz();
    }
    public Double wez(){
        return temperatura;
    }
}
