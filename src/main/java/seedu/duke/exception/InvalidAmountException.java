package seedu.duke.exception;

public class InvalidAmountException extends Exception {

    public enum ErrorReason {
        MISSING,        // nothing after 'add'
        NON_NUMERIC,    // couldn't parse as BigDecimal
        NEGATIVE,       // amount < 0
        TOO_MANY_DP     // scale > 2
    }

    public final ErrorReason reason;

    public InvalidAmountException(ErrorReason reason, String message) {
        super(message);
        this.reason = reason;
    }
}
