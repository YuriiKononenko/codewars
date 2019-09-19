
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuplicateEncoder {

    static String encode(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        char[] finalChars = new char[chars.length];
        boolean isDuplicated = false;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    isDuplicated = true;
                    break;
                }
            }

            if (isDuplicated) {
                finalChars[i] = ')';
            } else {
                finalChars[i] = '(';
            }
            isDuplicated = false;
        }
        return new String(finalChars);
    }


    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }

}
