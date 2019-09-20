
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangleTester {
    static boolean isTriangle(int a, int b, int c) {
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        float p = (float) (a + b + c) / 2;
        float v = p * (p - a) * (p - b) * (p - c);
        return v >= 0;
    }

    @Test
    public void publicTests() {
        assertTrue(TriangleTester.isTriangle(1, 2, 2));
        assertFalse(TriangleTester.isTriangle(7, 2, 2));
    }


}
