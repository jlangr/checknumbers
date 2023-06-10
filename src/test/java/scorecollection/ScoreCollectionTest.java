package scorecollection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCollectionTest {
   @Test
   void returnsTheMeanOfTheNumericValues() {
      var collection = new ScoreCollection();
      collection.add(new Item(5));
      collection.add(new Item(7));

      int actualResult = collection.arithmeticMean();

      assertEquals(6, actualResult);
   }
}
