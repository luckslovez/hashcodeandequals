package lighting.talks;

import static junit.framework.TestCase.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class PhoneNumberHashTest {

    public HashMap<PhoneNumber, String> hashedCollection = new HashMap<PhoneNumber, String>();

    @Test
    public void hashedCollectionTest() {
        hashedCollection.put(new PhoneNumber(707, 867, 4322), "Jason");

        assertEquals("Jason",
                hashedCollection.get(new PhoneNumber(707, 867, 4322)));
    }

}
