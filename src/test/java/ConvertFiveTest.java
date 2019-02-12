import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ConvertFiveTest {
    private int number = 100523;
   private ReplaceZero replaceNumber = new ReplaceZero();
    @Test
    public void convertToFive() {
    assertEquals(155523,replaceNumber.convertFive(number));

    }
    @Test
    public void failToConvertFive() {
        assertNotEquals(111542,replaceNumber.convertFive(number));

    }
}
