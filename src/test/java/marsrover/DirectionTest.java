package marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DirectionTest {
   Point pointStartingAtOrigin;

   @BeforeEach
   void setUp() {
      pointStartingAtOrigin = new Point(0, 0);
   }

   @Test
   void movesEast() {
      assertEquals(new Point(1, 0), Direction.EAST.moveForwardFrom(pointStartingAtOrigin));
   }

   @Test
   void movesSouth() {
      assertEquals(new Point(0, -1), Direction.SOUTH.moveForwardFrom(pointStartingAtOrigin));
   }

   @Test
   void movesWest() {
      assertEquals(new Point(-1, 0), Direction.WEST.moveForwardFrom(pointStartingAtOrigin));
   }

   @Test
   void movesNorth() {
      assertEquals(new Point(0, 1), Direction.NORTH.moveForwardFrom(pointStartingAtOrigin));
   }
}