package Strategy;

public abstract class TimeMeasure {
    private long before;
    private long after;
    private long measurement;
    public void Measure(){
        System.out.println();
        measurement=after-before;
        System.out.println("Odmierzono czas sortowania: " + measurement);
    }
    public void Start(){
        this.before=System.currentTimeMillis();
    }
    public void Stop(){
        this.after=System.currentTimeMillis();
    }
    public long getMeasurement(){
        return measurement;
    }
}
