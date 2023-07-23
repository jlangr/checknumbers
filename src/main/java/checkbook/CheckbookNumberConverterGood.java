package checkbook;

public class CheckbookNumberConverterGood {
   String[] units = {
      "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
      "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
   };

   String[] tens = {
      "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
   };

   public String toWords(int number) {
      return number == 0
         ? "zero"
         : toPositiveWords(number);
   }

   private String toPositiveWords(int number) {
      if (number < 20)
         return units[number];

      if (number < 100)
         return tens[number / 10] + tensSeparator(number % 10) + units[number % 10];

      if (number < 1000)
         return units[number / 100] + " hundred" + separator(number % 100) + toPositiveWords(number % 100);

      if (number < 1000000)
         return toPositiveWords(number / 1000) + " thousand" + separator(number % 1000) + toPositiveWords(number % 1000);

      return "one million";
   }

   private String tensSeparator(int remaining) {
      return separator(remaining, "-");
   }
   private String separator(int remaining) {
      return separator(remaining, " ");
   }
   private String separator(int remaining, String ch) {
      return remaining > 0 ? ch : "";
   }
}

// some inelegant solutions:
// https://stackoverflow.com/questions/3911966/how-to-convert-number-to-words-in-java
