package scorecollection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO parameterized tests
class RomanTest {
    @Test
    public void convert() {
        assertEquals("I", Roman.convert(1));
        assertEquals("II", Roman.convert(2));
        assertEquals("III", Roman.convert(3));
        assertEquals("X", Roman.convert(10));
        assertEquals("XI", Roman.convert(11));
        assertEquals("XX", Roman.convert(20));
        assertEquals("C", Roman.convert(100));
        assertEquals("CXXIII", Roman.convert(123));
        assertEquals("CCC", Roman.convert(300));
    }
}