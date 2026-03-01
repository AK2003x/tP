package seedu.duke.data;

import seedu.duke.categories.Category;

import java.math.BigDecimal;

public class Expense implements Category{

    private final BigDecimal amount;
    private String category;

    public Expense(BigDecimal amount) {
        this.amount = amount;
        this.category = "OTHER";
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setCategory(String category) {
        this.category = category.toUpperCase();
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String getTypeIcon() {
        return category.substring(0, 1); // First letter of category
    }

    @Override
    public String toString() {
        return "$" + amount + " [" + category + "]";
    }
}