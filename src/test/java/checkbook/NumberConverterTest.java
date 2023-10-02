package checkbook;

import org.junit.jupiter.api.*;

import static checkbook.NumberConverter.toWords;
import static org.junit.jupiter.api.Assertions.*;

public class NumberConverterTest {
   @Test
   public void zero() {
      assertEquals("zero", toWords(0));
   }

   @Test
   void one() {
      assertEquals("one", toWords(1));
   }

   @Test
   void nine() {
      assertEquals("nine", toWords(9));
   }

   @Test
   void tens() {
      assertEquals("twenty", toWords(20));
      assertEquals("ninety", toWords(90));
   }

   @Test
   void combinedUnitsAndTens() {
      assertEquals("thirty-two", toWords(32));
//      assertEquals("eighty-eight", toWords(88));
   }
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
