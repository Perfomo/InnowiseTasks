package exp.toleyko.fileSystem.tools;

import java.util.regex.Pattern;

public class StringValidtor {
    private static final String regex = "^(\\w+/?)*(\\w+\\.\\w+)?$";

    public static boolean isValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        return Pattern.matches(regex, name);
    }
}
