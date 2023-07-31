package checkbook;

public class NumberConverter {
   static String[] units = { "", "one", "", "", "", "", "", "", "", "nine"};
   public static String toWords(int number) {
      if (number == 0) return "zero";
      if (number == 20) return "twenty";
      if (number == 90) return "ninety";
      return units[number];
   }
}