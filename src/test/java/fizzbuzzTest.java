
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
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

    @Test
    public void isDivisibleByFive() {
        assertTrue(fizzbuzz.isDivisibleByFive(5));
    }

    @Test
    public void isNotDivisibleByFive() {
        assertFalse(fizzbuzz.isDivisibleByFive(1));
    }
    @Test
    public void isDivisibleByFifteen() {
        assertTrue(fizzbuzz.isDivisibleByFifteen(15));
    }
    @Test
    public void isNotDivisibleByFifteen() {
        assertFalse(fizzbuzz.isDivisibleByFifteen(1));
    }
    @Test
    public void sayFizzbuzz() {
        assertEquals("Fizzbuzz", fizzbuzz.play(15));
    }
    @Test
    public void sayFizz() {
        TestCase.assertEquals("Fizz", fizzbuzz.play(3));
    }
    @Test
    public void sayBuzz() {
        TestCase.assertEquals("Buzz", fizzbuzz.play(5));
    }
    @Test
    public void sayNumber() {
        TestCase.assertEquals("8", fizzbuzz.play(8));
    }
}