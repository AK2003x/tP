package seedu.duke.categories;

public class Food implements Category {
    public String getTypeIcon() {
        return "[Food]";
    }

    public String toString() {
        return "You have assigned this expense to " + getTypeIcon();
    }
}
