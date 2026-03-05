package seedu.duke.categories;

public class Miscellaneous implements Category {
    public String getTypeIcon() {
        return "[Misc]";
    }

    public String toString() {
        return "This expense has been automatically assigned to " + getTypeIcon();
    }
}
