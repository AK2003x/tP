package seedu.duke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FinTrackProTest {
    @Test
    public void requiresExactCommandInput_zeroArgCommands_returnsTrue() {
        assertTrue(FinTrackPro.requiresExactCommandInput("help"));
        assertTrue(FinTrackPro.requiresExactCommandInput("summary"));
        assertTrue(FinTrackPro.requiresExactCommandInput("bye"));
        assertTrue(FinTrackPro.requiresExactCommandInput("list"));
        assertTrue(FinTrackPro.requiresExactCommandInput("savings"));
        assertTrue(FinTrackPro.requiresExactCommandInput("allowance"));
        assertTrue(FinTrackPro.requiresExactCommandInput("ratio"));
        assertTrue(FinTrackPro.requiresExactCommandInput("save"));
        assertTrue(FinTrackPro.requiresExactCommandInput("clear"));
        assertTrue(FinTrackPro.requiresExactCommandInput("reset"));
    }

    @Test
    public void requiresExactCommandInput_commandsWithArgs_returnsFalse() {
        assertFalse(FinTrackPro.requiresExactCommandInput("add"));
        assertFalse(FinTrackPro.requiresExactCommandInput("delete"));
        assertFalse(FinTrackPro.requiresExactCommandInput("sort"));
        assertFalse(FinTrackPro.requiresExactCommandInput("deleterecurring"));
    }

    @Test
    public void isExactCommandInput_exactCommandOnly_returnsTrue() {
        assertTrue(FinTrackPro.isExactCommandInput("savings", "savings"));
        assertTrue(FinTrackPro.isExactCommandInput("  ratio  ", "ratio"));
        assertTrue(FinTrackPro.isExactCommandInput("HELP", "help"));
    }

    @Test
    public void isExactCommandInput_withExtraArgs_returnsFalse() {
        assertFalse(FinTrackPro.isExactCommandInput("savings 10", "savings"));
        assertFalse(FinTrackPro.isExactCommandInput("ratio 0.5", "ratio"));
        assertFalse(FinTrackPro.isExactCommandInput("bye now", "bye"));
    }
}

