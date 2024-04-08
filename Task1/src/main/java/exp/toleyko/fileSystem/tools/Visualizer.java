package exp.toleyko.fileSystem.tools;


import exp.toleyko.fileSystem.elements.Element;
import exp.toleyko.fileSystem.elements.Folder;

public class Visualizer {
    public static void vis(Folder root) {
        for(Element element : root.getElements().values()) {
            element.print("");
        }
    }
}
