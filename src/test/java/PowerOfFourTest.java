import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PowerOfFourTest {
    private IsPowerOfFour powerOfFour = new IsPowerOfFour();

    @Test
    public void PowerOfFour() {
        assertEquals(1, powerOfFour.isPowerOfFour(16));
    }

    @Test
    public void NotPowerOfFour() {
        assertNotEquals(3, powerOfFour.isPowerOfFour(9));
    }
}
