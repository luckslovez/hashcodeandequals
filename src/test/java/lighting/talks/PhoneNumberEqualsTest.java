package lighting.talks;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class PhoneNumberEqualsTest {

    @Test
    public void reflexiveTest() {
        PhoneNumber x = new PhoneNumber(707, 867, 4322);

        assertEquals(x, x);
    }

    @Test
    public void symmetricTest() {
        PhoneNumber x = new PhoneNumber(707, 867, 4322);
        PhoneNumber y = new PhoneNumber(707, 867, 4322);

        assertEquals(x.equals(y), y.equals(x));
    }

    @Test
    public void transitiveTest() {
        PhoneNumber x = new PhoneNumber(707, 867, 4322);
        PhoneNumber y = new PhoneNumber(707, 867, 4322);
        PhoneNumber z = new PhoneNumber(707, 867, 4322);

        assertEquals(x, y);
        assertEquals(x, z);
        assertEquals(y, z);
    }

    @Test
    public void consistentTest() {
        PhoneNumber x = new PhoneNumber(707, 867, 4322);
        PhoneNumber y = new PhoneNumber(707, 867, 4322);

        for (int i = 0; i < 99; i++) {
            assertEquals(x, y);
        }
    }
}
