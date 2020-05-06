import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wprowadz tekst");
        PlainText text = new Text(s.nextLine());
        System.out.println("Wypisz, które chcesz tagi:");
        System.out.println("0. Bold");
        System.out.println("1. Important");
        System.out.println("2. Italic");
        System.out.println("3. Emphasized");
        System.out.println("4. Marked");
        System.out.println("5. Small");
        System.out.println("6. Paragraph");
        System.out.println("7. Inserted");
        System.out.println("8. Subscript");
        System.out.println("9. Superscript");
        String typedTags = s.nextLine();
            if(typedTags.contains("1")){text=new Strong(text);}
            if(typedTags.contains("2")){text=new I(text);}
            if(typedTags.contains("3")){text=new EM(text);}
            if(typedTags.contains("4")){text=new Mark(text);}
            if(typedTags.contains("5")){text=new Small(text);}
            if(typedTags.contains("6")){text=new P(text);}
            if(typedTags.contains("7")){text=new Ins(text);}
            if(typedTags.contains("8")){text=new Sub(text);}
            if(typedTags.contains("9")){text=new Sup(text);}
            if(typedTags.contains("0")){text=new B(text);}
        text.write();
        }
    }


