public abstract class Tag extends PlainText {
    protected PlainText plainText;
    public Tag(PlainText plainText,String tag, String tagx){

        this.plainText = plainText;
        this.plainText.setText(tag+this.plainText.textFragment+tagx);
        textFragment=plainText.textFragment;
    }
    @Override
    public void write() {
        plainText.setText(this.textFragment);
        plainText.write();
    }
}
