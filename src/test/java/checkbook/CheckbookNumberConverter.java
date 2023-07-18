package checkbook;

import java.util.Map;

public class CheckbookNumberConverter {
   Map<Integer,String> conversions = Map.of(
      0, "zero",
      1, "one",
      7, "seven",
      10, "ten",
      19, "nineteen"
   );

   Map<Integer,String> tensConversions = Map.of(
      2, "twenty"
   );
   public String convert(int number) {
      if (number >= 20) {
         var tensDigit = number / 10;
         var remainder = number % 10;
         var s = tensConversions.get(tensDigit);
         if (remainder > 0)
            s += "-" + conversions.get(remainder);
         return s;
      }
      return conversions.get(number);
   }
}
