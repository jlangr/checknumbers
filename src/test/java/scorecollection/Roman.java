package scorecollection;

import java.util.List;

public class Roman {
   record Conversion(int arabicDigit, String romanDigit) {};

   static List<Conversion> conversions = List.of(
      new Conversion(100, "C"),
      new Conversion(10, "X"),
      new Conversion(1, "I")
   );


   public static String convert(int arabic) {
      var s = "";
      for (var conversion: conversions) {
         var digitsToConvert = arabic / conversion.arabicDigit();
         s += conversion.romanDigit().repeat(digitsToConvert);
         arabic -= conversion.arabicDigit() * digitsToConvert;
      }
      return s;
   }
}
