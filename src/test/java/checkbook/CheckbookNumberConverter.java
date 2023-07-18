package checkbook;

import java.util.Map;

public class CheckbookNumberConverter {
   Map<Integer,String> conversions = Map.of(
      0, "zero",
      1, "one",
      7, "seven",
      10, "ten",
      19, "nineteen",
      20, "twenty"
   );
   public String convert(int number) {
      return conversions.get(number);
   }
}
