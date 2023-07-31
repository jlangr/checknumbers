package checkbook;

public class NumberConverter {
   public static String toWords(int number) {
      if (number == 0) return "zero";
      return "one";
   }
}