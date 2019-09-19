import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MorseCodeEncoderTest {
    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }

}
