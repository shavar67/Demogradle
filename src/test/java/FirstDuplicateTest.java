import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FirstDuplicateTest {

    private FirstDuplicate arrayToTest = new FirstDuplicate();
    private int [] array = {1,3,5,1,2,2};


    @Test
    public void hashMapTest(){
        assertEquals(1,arrayToTest.firstDuplicateHash(array));
    }

    @Test
    public void fail(){
        assertNotEquals(Math.random() * 10,arrayToTest.firstDuplicateHash(array));
    }
}
