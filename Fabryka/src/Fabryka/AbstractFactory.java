package Fabryka;

import Tagi.Text;

public abstract class AbstractFactory {

    public void createTag(String t, Integer choice){
        Text text = createText(t,choice);
        text.write();
    }
    protected abstract Text createText(String t, Integer choice);
}
