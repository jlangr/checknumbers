package checkbook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ACheckbookNumberConverter {
   private CheckbookNumberConverter converter;

   @BeforeEach
   public void createConverter() {
      converter = new CheckbookNumberConverter();
   }

   @ParameterizedTest
   @CsvSource(value={
      "0,zero",
      "1,one",
      "7,seven",
      "10,ten",
      "19,nineteen",
      "20,twenty",
      "21,twenty-one",
//      "90,ninety",
//      "55,fifty-five",
//      "99,ninety-nine",
//      "100,one hundred",
//      "900,nine hundred",
//      "101,one hundred one",
//      "999,nine hundred ninety-nine",
//      "1000,one thousand",
//      "9000,nine thousand",
//      "9001,nine thousand one",
//      "9999,nine thousand nine hundred ninety-nine",
//      "9911,nine thousand nine hundred eleven",
//      "10000,ten thousand",
//      "19000,nineteen thousand",
//      "19999,nineteen thousand nine hundred ninety-nine",
//      "100000,one hundred thousand",
//      "700000,seven hundred thousand",
//      "198000,one hundred ninety-eight thousand",
//      "701020,seven hundred one thousand twenty",
//      "one million,1000000"
   })
   void convertsIntegersToSpoken(String numberAsText, String expected) {
      var number = Integer.parseInt(numberAsText);
      assertEquals(expected, converter.convert(number));
   }
}
