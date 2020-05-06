package Fabryka;

import Tagi.*;

public class HTMLTagFactory extends AbstractFactory {

    @Override
    protected Text createText(String text, Integer choice) {
        switch (choice){
            case 1:
                return new Strong(text);
            case 2:
                return new EM(text);
            case 3:
                return new P(text);
            case 4:
                return new Mark(text);
            default:
                return new Strong("bledne wpisanie numeru tagu, uruchom program ponownie");
        }
    }
}
