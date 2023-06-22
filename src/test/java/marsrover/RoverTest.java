package marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import static marsrover.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
   Rover rover = new Rover(new Point(0, 0), EAST);

   @Test
   void moveForwardFromPoint() {
      rover.execute(new char[]{'f'});
      assertEquals(new Point(1, 0), rover.point());
   }

   @Test
   void moveBackwardFromPoint() {
      rover.execute("b");
      assertEquals(new Point(-1, 0), rover.point());
   }

   @Test
   void moveForwardMultipleTimes() {
      rover.execute("fff");
      assertEquals(new Point(3, 0), rover.point());
   }

   @Test
   void moveRight() {
      rover.execute("r");
      assertEquals(SOUTH, rover.direction());
   }

   @Test
   void moveLeft() {
      rover.execute("l");
      assertEquals(NORTH, rover.direction());
   }

   @Test
   void multipleCommandsViaString() {
      rover.execute("ff");
      assertEquals(new Point(2, 0), rover.point());
   }

   @Test
   void stopsShortOfObstacleMovingForward() {
      rover.addObstacle(2, 1);

      rover.execute("fflf");

      assertEquals(new Point(2, 0), rover.point());
      assertEquals(NORTH, rover.direction());
   }

   @Test
   void stopsShortOfObstacleMovingBackward() {
      rover.addObstacle(-2, 0);

      rover.execute("bb");

      assertEquals(new Point(-1, 0), rover.point());
      assertEquals(EAST, rover.direction());
   }


   @Nested
   class WithSize3 {
      Rover roverAtOrigin;

      @BeforeEach
      void setSize() {
         roverAtOrigin = new Rover(new Point(0, 0), EAST);
         roverAtOrigin.setSize(3);
      }

      @Test
      void wrapsAroundEast() {
         roverAtOrigin.setDirection(EAST);
         roverAtOrigin.execute("ff");

         roverAtOrigin.execute("f");

         assertEquals(new Point(-2, 0), roverAtOrigin.point());
      }

      @Test
      void wrapsAroundWest() {
         roverAtOrigin.setDirection(WEST);
         roverAtOrigin.execute("ff");

         roverAtOrigin.execute("f");

         assertEquals(new Point(2, 0), roverAtOrigin.point());
      }

      @Test
      void wrapsAroundSouth() {
         roverAtOrigin.setDirection(SOUTH);
         roverAtOrigin.execute("ff");

         roverAtOrigin.execute("f");

         assertEquals(new Point(0, 2), roverAtOrigin.point());
      }

      @Test
      void wrapsAroundNorth() {
         roverAtOrigin.setDirection(NORTH);
         roverAtOrigin.execute("ff");

         roverAtOrigin.execute("f");

         assertEquals(new Point(0, -2), roverAtOrigin.point());
      }
   }
}
