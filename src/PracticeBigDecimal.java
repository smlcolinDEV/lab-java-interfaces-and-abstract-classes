import java.math.BigDecimal;
import java.math.RoundingMode;

public class PracticeBigDecimal {
    public static void main(String[] args) {
        // Create BigDecimal instances with specific values.
        BigDecimal number = new BigDecimal(4.2545);
        BigDecimal positiveNumber = new BigDecimal(1.2345);
        BigDecimal negativeNumber = new BigDecimal(-45.67);

        // Print the rounded value of 'number'.
        System.out.println(roundedBigdecimal(number));

        // Print the reversed (negated) value of 'positiveNumber'.
        System.out.println(reverseBigdecimal(positiveNumber));

        // Print the reversed (negated) value of 'negativeNumber'.
        System.out.println(reverseBigdecimal(negativeNumber));
    }

    /**
     * Method to round a BigDecimal number to 2 decimal places using HALF_EVEN rounding mode.
     * @param number The BigDecimal number to be rounded.
     * @return The rounded BigDecimal number.
     */
    public static BigDecimal roundedBigdecimal(BigDecimal number) {
        // Round the number to 2 decimal places using HALF_EVEN rounding mode.
        return number.setScale(2, RoundingMode.HALF_EVEN);
    }

    /**
     * Method to negate a BigDecimal number and round it to 1 decimal place using HALF_EVEN rounding mode.
     * @param number The BigDecimal number to be negated and rounded.
     * @return The negated and rounded BigDecimal number.
     */
    public static BigDecimal reverseBigdecimal(BigDecimal number) {
        // Negate the number and round it to 1 decimal place using HALF_EVEN rounding mode.
        return number.negate().setScale(1, RoundingMode.HALF_EVEN);
    }
}
