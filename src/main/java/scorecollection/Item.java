package scorecollection;

public class Item implements Scoreable {
   private final int score;

   public Item(int score) {
      this.score = score;
   }

   @Override
   public int score() {
      return score;
   }
}
