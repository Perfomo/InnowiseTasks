package exp.toleyko.fileSystem.elements;

abstract public class Element {
    public String name;
    public Element(String name) {
        this.name = name;
    }

    abstract public void print(String whiteSpace);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
