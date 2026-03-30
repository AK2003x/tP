package seedu.duke.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for the ArchivedExpense DTO.
 */
public class ArchivedExpenseTest {

    @Test
    public void constructor_validValues_gettersReturnSameValues() {
        ArchivedExpense archivedExpense = new ArchivedExpense("Lunch", "15.50", "FOOD", false);

        assertEquals("Lunch", archivedExpense.getName());
        assertEquals("15.50", archivedExpense.getAmount());
        assertEquals("FOOD", archivedExpense.getCategory());
    }

    @Test
    public void constructor_nullName_throwsAssertion() {
        assertThrows(AssertionError.class, () -> new ArchivedExpense(null, "15.50", "FOOD", false));
    }

    @Test
    public void constructor_nullAmount_throwsAssertion() {
        assertThrows(AssertionError.class, () -> new ArchivedExpense("Lunch", null, "FOOD", false));
    }

    @Test
    public void constructor_nullCategory_throwsAssertion() {
        assertThrows(AssertionError.class, () -> new ArchivedExpense("Lunch", "15.50", null, false));
    }
}

