package seedu.duke.exception;

public class InvalidIndexException extends Exception {
    public enum ErrorReason {
        MISSING,        // nothing after 'add'
        INVALID,       // amount < 0
    }

    private final ErrorReason reason;

    public InvalidIndexException(ErrorReason reason, String message) {
        super(message);
        this.reason = reason;
    }

    public ErrorReason getReason() {
        return reason;
    }
}
