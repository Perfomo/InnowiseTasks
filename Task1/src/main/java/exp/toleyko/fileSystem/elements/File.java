package exp.toleyko.fileSystem.elements;


public class File extends Element {

    public File(String name) {
        super(name);
    }

    @Override
    public void print(String whiteSpace) {
        System.out.println(whiteSpace + this.name);
    }

}
