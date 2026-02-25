package seedu.duke;

import seedu.duke.ui.Ui;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;

public class FinTrackPro {

    private static final NumberFormat MONEY_FMT = NumberFormat.getCurrencyInstance(Locale.US);

    private final Ui ui;

    public FinTrackPro(Ui ui){
        this.ui = ui;
    }

    // to make sure that it is always 2dp + comma separator (eg 12,250.00)
    private static String formatMoney(BigDecimal amount) {
        return MONEY_FMT.format(amount);
    }

    /**
     * Reads money amount with strict rules:
     * - digits only, optional decimal point
     * - max 2 decimal places
     * - non-negative
     * - no commas, no letters, no other symbols
     */
    private static BigDecimal readMoney(Ui ui, Scanner in, String prompt) {
        while (true) {
            String moneyString = ui.readLine(in,prompt).trim();

            // Only digits, optionally ".digits" (1-2 dp)
            // Allows: "10250", "10250.5", "10250.50"
            // Rejects: "-1", "10,250", "$100", "12.345", "12.", ".50", "12 3", "abc"
            if (!moneyString.matches("\\d+(\\.\\d{1,2})?")) {
                ui.printLine("Bruh I need a valid amount like " +
                        "10250 or 10250.50 (numbers only, max 2 dp). Try again.");
                continue;
            }

            try {
                BigDecimal amount = new BigDecimal(moneyString);

                if (amount.compareTo(BigDecimal.ZERO) < 0) {
                    ui.printLine("The amount cannot be negative. Please try again.");
                    continue;
                }
                return amount;
            } catch (NumberFormatException e) {
                ui.printLine("Invalid number. Please try again!");
            }
        }
    }

    private static LocalDate readFutureDate(Ui ui, Scanner in, String prompt) {
        while (true) {
            String s = ui.readLine(in, prompt).trim();

            try {
                LocalDate date = LocalDate.parse(s);
                LocalDate today = LocalDate.now();

                if (!date.isAfter(today)) {
                    ui.printLine("Deadline must be a future date. Try again.");
                    continue;
                }

                return date;

            } catch (DateTimeParseException e) {
                ui.printLine("Date format needs to be YYYY-MM-DD (e.g., 2026-12-31). Try again.");
            }
        }
    }

    public void run() {

        ui.showWelcome();

        Scanner in = new Scanner(System.in);

        String name = ui.readLine(in, "What is your name?").trim();

        if (name.isEmpty()){
            name = "friend";
        }

        ui.greet(name);

        ui.printLine("");
        ui.printLine("Hang tight... I have a few questions for you.");

        BigDecimal goal = readMoney(ui, in,
                "What is the total amount that you and your partner have to pay for the downpayment? (in dollars)");

        BigDecimal legalFees = goal.multiply(new BigDecimal("0.025"));
        BigDecimal totalRequired = goal.add(legalFees);

        ui.printLine("Sweeeett. Including 2.5% legal fees, you will need " + formatMoney(totalRequired));

        LocalDate deadline = readFutureDate(
                ui,
                in,
                "When do you need to save this money by? "
                        + "(Enter in format YYYY-MM-DD)"
        );
        LocalDate today = LocalDate.now();

        Period period = Period.between(today, deadline);

        ui.printLine("You have " + period.getYears() + " years and "
                + period.getMonths() + " months remaining.");

        ui.printLine("");
        ui.printLine("You can now type anything you want");
        ui.printLine("Type 'bye' to exit!");
        ui.printLine("");

        while (true) {
            String input = ui.readLine(in, "");
            if (input.equalsIgnoreCase("bye")) {
                ui.goodBye(name);
                break;
            }
            ui.printLine("You said: " + input);
        }
        in.close();
    }
}
