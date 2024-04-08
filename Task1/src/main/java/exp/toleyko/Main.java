package exp.toleyko;

import exp.toleyko.fileSystem.elements.Folder;
import exp.toleyko.fileSystem.tools.Builder;
import exp.toleyko.fileSystem.tools.StringValidtor;
import exp.toleyko.fileSystem.tools.Visualizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("");

        System.out.println("Start input: ");
        Scanner scanner = new Scanner(System.in);

        MAIN: while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            switch (input) {
                case "exit":
                    break MAIN;

                case "print":
                    Visualizer.vis(root);
                    break;

                default:
                    if (StringValidtor.isValid(input)) {
                        Builder.buildPath(input, root);
                    }
                    else {
                        System.out.println("Bad path");
                    }
            }
        }
    }
}