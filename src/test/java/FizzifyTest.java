import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzifyTest {

    Fizzify testFizzifier;

    @BeforeEach
    void init() {
        testFizzifier = new Fizzify();
    }

    // These tests cover numbers to be unchanged

    @Test
    void input1Returns1AsString_convert() {
        assertEquals("1", testFizzifier.convert(1));
    }

    @Test
    void input4Returns4AsString_convert() {
        assertEquals("4", testFizzifier.convert(4));
    }

    @Test
    void input7Returns7AsString_convert() {
        assertEquals("7", testFizzifier.convert(7));
    }

    @Test
    void input73Returns73AsString_convert() {
        assertEquals("73", testFizzifier.convert(73));
    }

    // These tests cover numbers to be converted to 'Fizz'

    @Test
    void input3ReturnsFizz_convert() {
        assertEquals("Fizz", testFizzifier.convert(3));
    }

    @Test
    void input9ReturnsFizz_convert() {
        assertEquals("Fizz", testFizzifier.convert(9));
    }

    @Test
    void input33ReturnsFizz_convert() {
        assertEquals("Fizz", testFizzifier.convert(33));
    }

    @Test
    void input99ReturnsFizz_convert() {
        assertEquals("Fizz", testFizzifier.convert(99));
    }

    // These tests cover numbers to be converted to 'Buzz'

    @Test
    void input5ReturnsBuzz_convert() {
        assertEquals("Buzz", testFizzifier.convert(5));
    }

    @Test
    void input10ReturnsBuzz_convert() {
        assertEquals("Buzz", testFizzifier.convert(10));
    }

    @Test
    void input40ReturnsBuzz_convert() {
        assertEquals("Buzz", testFizzifier.convert(40));
    }

    @Test
    void input95ReturnsBuzz_convert() {
        assertEquals("Buzz", testFizzifier.convert(95));
    }
}
