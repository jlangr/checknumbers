package checkbook;

import org.junit.jupiter.api.*;

import static checkbook.NumberConverter.toWords;
import static org.junit.jupiter.api.Assertions.*;

public class NumberConverterTest {
   @Test
   public void zero() {
      assertEquals("zero", toWords(0));
   }

   /*
    * NOTE: TDD does not mean write all the tests first!
    *       THIS IS AN EXERCISE!
    *
    * Imagine that you are writing them one at a time.
    *
    * When a test has more than one assert, enable asserts one at a time
    */

    /* Delete this line to enable the next test
    @Test
    public void single_digit() {
        assertEquals("one", NumberConverter.toWords(1));
        // Uncomment other lines after getting the initial test to pass
        // assertEquals("nine", NumberConverter.toWords(9));
    }

    /* Delete this line to enable the next test
    @Test
    public void special_case_two_digit() {
        assertEquals("ten", NumberConverter.toWords(10));
        // assertEquals("nineteen", NumberConverter.toWords(19));
    }

    /* Delete this line to enable the next test
    @Test
    public void multiples_of_ten() {
        assertEquals("twenty", NumberConverter.toWords(20));
        // assertEquals("ninety", NumberConverter.toWords(90));
    }

    /* Delete this line to enable the next test
    @Test
    public void not_multiples_of_ten_21_to_99() {
        assertEquals("twenty-one", NumberConverter.toWords(21));
        // assertEquals("fifty-five", NumberConverter.toWords(55));
        // assertEquals("ninety-nine", NumberConverter.toWords(99));
    }

    /* Delete this line to enable the next test
    @Test
    public void hundreds() {
        assertEquals("one hundred", NumberConverter.toWords(100));
        // assertEquals("nine hundred", NumberConverter.toWords(900));
    }

    /* Delete this line to enable the next test
    @Test
    public void not_multiples_of_one_hundred_LT_1000() {
        assertEquals("one hundred one", NumberConverter.toWords(101));
        // assertEquals("nine hundred ninety-nine", NumberConverter.toWords(999));
    }

    /* Delete this line to enable the next test
    @Test
    public void thousands() {
        assertEquals("one thousand", NumberConverter.toWords(1000));
        // assertEquals("nine thousand", NumberConverter.toWords(9000));
    }

    /* Delete this line to enable the next test
    @Test
    public void not_even_thousands() {
        assertEquals("nine thousand nine hundred ninety-nine", NumberConverter.toWords(9999));
        // assertEquals("nine thousand nine hundred eleven", NumberConverter.toWords(9911));
    }

    /* Delete this line to enable the next test
    @Test
    public void tens_of_thousands() {
        assertEquals("ten thousand", NumberConverter.toWords(10000));
        // assertEquals("nineteen thousand", NumberConverter.toWords(19000));
    }

    /* Delete this line to enable the next test
    @Test
    public void tens_of_thousands_and_some() {
        assertEquals("nineteen thousand nine hundred ninety-nine", NumberConverter.toWords(19999));
    }

    /* Delete this line to enable the next test
    @Test
    public void hundred_thousand() {
        assertEquals("one hundred thousand", NumberConverter.toWords(100000));
        // assertEquals("seven hundred thousand", NumberConverter.toWords(700000));
    }

    /* Delete this line to enable the next test
    @Test
    public void not_exactly_hundred_thousand() {
        assertEquals("one hundred ninety-eight thousand", NumberConverter.toWords(198000));
        // assertEquals("seven hundred one thousand twenty", NumberConverter.toWords(701020));
    }

    /* Delete this line to enable the next test
    @Test
    public void millions() {
        assertEquals("one million", NumberConverter.toWords(1000000));
    }

    Delete this line to build the last test *****/

   // Write any other tests you need to be happy with your NumberConverter.

}

//   @ParameterizedTest
//   @CsvSource(value={
//      "0,zero",
//      "1,one",
//      "1000000,one million"
//   })
//   void convertsIntegersToSpoken(String numberAsText, String expected) {
//      var number = Integer.parseInt(numberAsText);
//      assertEquals(expected, converter.toWords(number));
//   }
