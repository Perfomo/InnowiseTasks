package exp.toleyko.fileSystem.elements;

import java.util.HashMap;
import java.util.Map;

public class Folder extends Element {
    private Map<String, Element> elements;

    public Folder(String name) {
        super(name);
        elements = new HashMap<>();
    }

    public void addElement(Element element) {
        elements.put(element.getName(), element);
    }

    @Override
    public void print(String whiteSpace) {
        System.out.println(whiteSpace + this.name + "/");
        for (Element element : this.getElements().values()) {
            element.print(whiteSpace + "\t");
        }
    }

    public Map<String, Element> getElements() {
        return elements;
    }

}
