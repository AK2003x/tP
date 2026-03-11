package seedu.duke.exception;

public class InvalidIndexException extends Exception {
    public enum ErrorReason {
        MISSING,        // nothing after 'add'
        INVALID,       // amount < 0 or non-numeric input
    }

    public final ErrorReason reason;

    public InvalidIndexException(ErrorReason reason, String message) {
        super(message);
        this.reason = reason;
    }
}
