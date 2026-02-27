package seedu.duke;

public class Parser {
    public static int MAX_SPLIT_LENGTH = 2;

    public static String parseCommand(String input) {
        String[] parts = input.split(" ", MAX_SPLIT_LENGTH);
        return parts[0];
    }
}
