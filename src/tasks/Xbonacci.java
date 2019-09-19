import java.util.Arrays;

public class Xbonacci {

    /**
     * signature array/list, returns the first n elements - signature included of the so seeded sequence.
     */

    public double[] tribonacci(double[] s, int n) {
        double[] finalArray = Arrays.copyOf(s, n);
        for (int i = s.length; i < n; i++) {
            finalArray[i] = finalArray[i - 1] + finalArray[i - 2] + finalArray[i - 3];
        }
        return finalArray;
    }

}
