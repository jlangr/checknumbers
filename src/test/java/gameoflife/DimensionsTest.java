package gameoflife;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DimensionsTest {
   @Test
   void parseDimensions() {
      var dimensions = Dimensions.parseFrom("  2 3");
      assertEquals(2, dimensions.rows());
      assertEquals(3, dimensions.cols());
   }
}