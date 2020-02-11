import java.util.stream.LongStream;

class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        Long[] primesInRange = LongStream.range(m, n + 1)
                .filter(GapInPrimes::isPrime)
                .boxed()
                .toArray(Long[]::new);
        return findFirstGap(g, primesInRange);
    }

    private static long[] findFirstGap(int gap, Long[] rangeToCheck) {
        for (int i = 0; i < rangeToCheck.length - 1; i++) {
            if (rangeToCheck[i + 1] - rangeToCheck[i] == gap) {
                return new long[]{rangeToCheck[i], rangeToCheck[i + 1]};
            }
        }
        return null;
    }

    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i != 0 && n % (i + 2) != 0) {
                continue;
            }
            return false;
        }

        return true;
    }

}