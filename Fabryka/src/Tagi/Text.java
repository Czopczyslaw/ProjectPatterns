package Tagi;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Text {
    protected String text;

    public Text(String text){
        this.text=text;
    }

    public Text setText(String text) {
        this.text = text;
        return this;
    }
    public void write(){
        System.out.println(text);
        FileWriter fw = null;
        try{
            fw=new FileWriter("file.html");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write("<center>");
            bw.write(this.text);
            bw.write("</center>");
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

