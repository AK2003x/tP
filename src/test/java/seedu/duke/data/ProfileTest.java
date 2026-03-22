package seedu.duke.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfileTest {

    private Profile profile;

    @BeforeEach
    public void setUp() {
        profile = new Profile();
    }

    @Test
    public void monthlyAllowance_setAndGet_correctValueStored() {
        BigDecimal testAllowance = new BigDecimal("5000.50");
        profile.setMonthlyAllowance(testAllowance);
        assertEquals(testAllowance, profile.getMonthlyAllowance());
    }

    @Test
    public void currentSavings_setAndGet_correctValueStored() {
        BigDecimal testSavings = new BigDecimal("15000.75");
        profile.setCurrentSavings(testSavings);
        assertEquals(testSavings, profile.getCurrentSavings());
    }

    @Test
    public void contributionRatio_setAndGet_correctValueStored() {
        BigDecimal testRatio = new BigDecimal("0.60");
        profile.setContributionRatio(testRatio);
        assertEquals(testRatio, profile.getContributionRatio());
    }
}
