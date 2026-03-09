package seedu.duke.util;

import java.math.BigDecimal;

public class BtoCalculator {
    public final BigDecimal totalDownpayment;
    public final BigDecimal yourShare;

    public BtoCalculator(BigDecimal housePrice, BigDecimal ratio) {
        BigDecimal downpayment = housePrice.multiply(new BigDecimal("0.025"));
        BigDecimal legalFees = downpayment.multiply(BigDecimal.valueOf(1.1));
        this.totalDownpayment = downpayment.add(legalFees);
        this.yourShare = totalDownpayment.multiply(ratio);
    }
}
