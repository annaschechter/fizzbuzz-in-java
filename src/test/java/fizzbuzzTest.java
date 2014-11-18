import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class fizzbuzzTest {
    Fizzbuzz fizzbuzz;

    @Before
    public void setUp(){
        fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void isDivisibleByThree() {
        assertTrue(fizzbuzz.isDivisibleByThree(3));
    }
    @Test
    public void isNotDivisibleByThree() {
        assertFalse(fizzbuzz.isDivisibleByThree(1));
    }
}