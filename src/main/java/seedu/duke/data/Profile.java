package seedu.duke.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Manages the user's personal financial data, including income, savings,
 * and specific targets for BTO downpayment planning.
 */
public class Profile {
    private String name = "friend";
    private BigDecimal monthlySalary;
    private BigDecimal currentSavings;
    private BigDecimal btoGoal;
    private BigDecimal contributionRatio;
    private LocalDate deadline = LocalDate.now();

    /**
     * Initializes a profile with zero Salary/Savings and a default 50/50 split ratio.
     */
    public Profile() {
        this.monthlySalary = BigDecimal.ZERO;
        this.currentSavings = BigDecimal.ZERO;
        this.contributionRatio = new BigDecimal("0.5");
        this.btoGoal = BigDecimal.ZERO;
    }

    /**
     * Retrieves the target date by which the BTO savings goal should be met.
     *
     * @return The {@code LocalDate} representing the savings deadline.
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /**
     * Updates the target savings deadline.
     *
     * <p>This date is used to calculate the remaining time in the BTO Readiness Report.</p>
     *
     * @param deadline The new {@code LocalDate} to set as the savings deadline.
     */
    public void setDeadline(LocalDate deadline) {
        assert deadline != null : "Deadline cannot be null";
        assert deadline.isAfter(LocalDate.now()) : "Deadline must be in the future";
        this.deadline = deadline;
    }

    /**
     * Updates the user's name.
     *
     * @param name The name to be associated with this profile.
     */
    public void setName(String name) {
        assert name != null : "Name cannot be null";
        this.name = name;
    }

    /**
     * Gets the user's name.
     *
     * @return The name stored in the profile, or "friend" if not set.
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the individual share of the BTO target cost.
     * @param btoGoal The calculated BTO goal amount.
     */
    public void setBtoGoal(BigDecimal btoGoal) {
        assert btoGoal != null : "BTO goal cannot be null";
        assert btoGoal.compareTo(BigDecimal.ZERO) >= 0 : "BTO goal cannot be negative";
        this.btoGoal = btoGoal;
    }

    /**
     * Gets the individual's BTO target cost.
     * @return The BTO goal as a {@code BigDecimal}.
     */
    public BigDecimal getBtoGoal() {
        return btoGoal;
    }

    /**
     * Updates the user's monthly salary.
     * @param monthlySalary The new monthly income.
     */
    public void setMonthlySalary(BigDecimal monthlySalary) {
        assert monthlySalary != null : "Monthly salary cannot be null";
        assert monthlySalary.compareTo(BigDecimal.ZERO) >= 0 : "Monthly salary cannot be negative";
        this.monthlySalary = monthlySalary;
    }

    /**
     * Gets the user's monthly salary.
     * @return The monthly salary as a {@code BigDecimal}.
     */
    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * Updates the user's current liquid savings.
     * @param currentSavings The new savings total.
     */
    public void setCurrentSavings(BigDecimal currentSavings) {
        assert currentSavings != null : "Current savings cannot be null";
        this.currentSavings = currentSavings;
    }

    /**
     * Gets the user's current liquid savings.
     * @return The total savings as a {@code BigDecimal}.
     */
    public BigDecimal getCurrentSavings() {
        return currentSavings;
    }

    /**
     * Sets the share of the BTO cost relative to a partner.
     * @param contributionRatio A decimal representing the share (e.g., 0.5 for 50%).
     */
    public void setContributionRatio(BigDecimal contributionRatio) {
        assert contributionRatio != null : "Contribution ratio cannot be null";
        // Ensure the ratio is between 0% and 100%
        assert contributionRatio.compareTo(BigDecimal.ZERO) >= 0 &&
                contributionRatio.compareTo(BigDecimal.ONE) <= 0
                : "Contribution ratio must be between 0.0 and 1.0";
        this.contributionRatio = contributionRatio;
    }

    /**
     * Gets the current BTO contribution share ratio.
     * @return The ratio as a {@code BigDecimal}.
     */
    public BigDecimal getContributionRatio() {
        return contributionRatio;
    }

    public void reset() {
        this.name = "friend";
        this.btoGoal = BigDecimal.ZERO;
        this.monthlySalary = BigDecimal.ZERO;
        this.currentSavings = BigDecimal.ZERO;
        this.contributionRatio = new BigDecimal("0.5");
    }
}
