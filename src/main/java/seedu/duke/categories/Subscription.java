package seedu.duke.categories;

public class Subscription implements Category {
    public String getTypeIcon() {
        return "[Subscription]";
    }

    public String toString() {
        return "You have assigned this expense to " + getTypeIcon();
    }
}
