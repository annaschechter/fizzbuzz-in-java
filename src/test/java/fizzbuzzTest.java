import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class fizzbuzzTest {
    @Test
    public void isDivisibleByThree() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertTrue(fizzbuzz.isDivisibleByThree(3));
    }
}