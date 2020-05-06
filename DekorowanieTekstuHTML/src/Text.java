import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Text extends PlainText {
    public Text(String text) {
        this.textFragment = text;
    }
    public void write() {
        System.out.print(textFragment);
        FileWriter fw = null;
        try{
            fw=new FileWriter("file.html");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write("<center><h1>");
            bw.write(this.textFragment);
            bw.write("</h1></center>");
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            Desktop.getDesktop().open(new File("file.html"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            bw.close();
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        }
}
