package checkbook;

public class CheckbookNumberConverter2 {
   private final String[] units = {
      "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
      "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
   };
   private final String[] tens = {
      "","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
   };

   public String convert(int number) {
      if (number == 0) return "zero";

      var result = new StringBuilder();

      var remaining = number;
      remaining = toWords(remaining, result, 1000, "thousand", 1000, " ");
      remaining = toWords(remaining, result, 100, "hundred", 100, " ");

      appendSmallWords(result, remaining);
      return result.toString();
   }

   private int appendSmallWords(StringBuilder result, int remaining) {
      if (remaining >= 20) {
         var digit = remaining / 10;
         result.append(tens[digit]);
         remaining %= digit * 10;
         if (remaining > 0) result.append("-");
      }

      result.append(units[remaining]);
      return remaining;
   }

   private int toWords(int remaining, StringBuilder result, int level, String levelName, int threshold, String separator) {
      if (remaining >= threshold) {
         var digit = remaining / level;
         result.append(convert(digit) + " " + levelName);
         remaining %= level;
         if (remaining > 0) result.append(separator);
      }
      return remaining;
   }

}

