public abstract class PlainText {
    protected String textFragment;
    public void setText(String text){
        this.textFragment=text;
    }
    abstract public void write();
}
