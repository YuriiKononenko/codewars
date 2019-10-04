public class BitCounting {

    public static int countBits(int n) {
        String s = Integer.toBinaryString(n);
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                counter++;
            }
        }
        return counter;
    }

    //BEST SOLUTION
    public static int countBitsBest(int n) {
        return Integer.bitCount(n);
    }

}
