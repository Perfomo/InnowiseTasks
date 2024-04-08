package exp.toleyko.fileSystem.tools;

import exp.toleyko.fileSystem.elements.File;
import exp.toleyko.fileSystem.elements.Folder;

public class Builder {

    public static void buildPath(String path, Folder root) {
        String[] names = path.split("/");
        Folder currentFolder = root;
        for (int i = 0; i < names.length - 1; i++) {
            if (currentFolder.getElements().containsKey(names[i])) {
                currentFolder = (Folder) currentFolder.getElements().get(names[i]);
            }
            else {
                Folder newFolder = new Folder(names[i]);
                currentFolder.addElement(newFolder);
                currentFolder = newFolder;
            }
        }
        if (names[names.length-1].contains(".")) {
            currentFolder.addElement(new File(names[names.length-1]));
        }
        else {
            currentFolder.addElement(new Folder(names[names.length-1]));
        }
    }
}
