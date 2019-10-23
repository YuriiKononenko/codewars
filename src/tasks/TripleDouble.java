import java.util.ArrayList;
import java.util.List;

public class TripleDouble {

    public static int tripleDouble(long num1, long num2) {
        RepeatingDigits isTriple = isTripple(getDigits(num1));
        boolean isDouble = isDouble(getDigits(num2), isTriple.getRepeatingDigit());
        if (isTriple.isRepeating && isDouble) {
            return 1;
        } else {
            return 0;
        }
    }


    private static RepeatingDigits isTripple(Long[] digits) {
        boolean isTriple = false;
        long repeatingDigit = 0;
        for (int i = 0; i < digits.length - 2; i++) {
            if (digits[i].equals(digits[i + 1]) && digits[i + 1].equals(digits[i + 2])) {
                isTriple = true;
                repeatingDigit = digits[i];
                break;
            }
        }
        return new RepeatingDigits(isTriple, repeatingDigit);
    }

    private static boolean isDouble(Long[] digits, long repeatingNumber) {
        boolean isDouble = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == repeatingNumber && digits[i].equals(digits[i + 1])) {
                isDouble = true;
                break;
            }
        }
        return isDouble;
    }

    private static Long[] getDigits(long num) {
        List<Long> digits = new ArrayList<>();
        collectDigits(num, digits);
        return digits.toArray(new Long[]{});
    }

    private static void collectDigits(long num, List<Long> digits) {
        if (num / 10 > 0) {
            collectDigits(num / 10, digits);
        }
        digits.add(num % 10);
    }

    static class RepeatingDigits {
        private final boolean isRepeating;
        private final long repeatingDigit;

        RepeatingDigits(final boolean isRepeating, final long repeatingDigit) {
            this.isRepeating = isRepeating;
            this.repeatingDigit = repeatingDigit;
        }

        public boolean isRepeating() {
            return isRepeating;
        }

        long getRepeatingDigit() {
            return repeatingDigit;
        }
    }

}
