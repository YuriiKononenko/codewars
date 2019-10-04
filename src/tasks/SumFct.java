import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

import static java.math.BigInteger.valueOf;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {
        return valueOf(getFibonacciSequence(Integer.parseInt(n.toString())).
                stream().reduce(0, Integer::sum)).multiply(valueOf(4));
    }

    private static List<Integer> getFibonacciSequence(int n) {
        List<Integer> list = new LinkedList<>() {{
            add(0);
            add(1);
        }};
        for (int i = 2; i < n + 2; i++) {
            var number = list.get(i - 1) + list.get(i - 2);
            list.add(number);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(2)));
    }

}
