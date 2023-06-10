package scorecollection;

import java.util.*;

public class ScoreCollection {
   private final List<Scoreable> scores = new ArrayList<>();
   
   public void add(Scoreable scoreable) {
      scores.add(scoreable);
   }
   
   public int arithmeticMean() {
      var total = scores.stream().mapToInt(Scoreable::score).sum();
      return total / scores.size();
   }
}
