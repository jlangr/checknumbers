package gameoflife;

import org.junit.jupiter.api.Test;
import util.IO;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
   Grid grid = new Grid();

   @Test
   void parseLine() {
      var row = grid.parse("..*.");
      assertArrayEquals(new Boolean[] { false, false, true, false}, row);
   }

   @Test
   void loadFromReader() throws IOException {
      var reader = IO.toBufferedReader("""
         2 3
         ...
         *..
         """);

      grid.loadFrom(reader);

      assertFalse(grid.isAlive(0, 0));
      assertTrue(grid.isAlive(0, 1));
   }

   @Test
   void stopsExecutingCommandsAtFirstBlockForward() {

   }

   @Test
   void stopsExecutingCommandsAtFirstBlockBackward() {

   }

   @Test
   void toStringRepresentsGrid() {
      final var cells = new Boolean[][]{
         {true, false, true},
         {false, false, true}
      };
      grid.loadFrom(cells);

      assertEquals("""
         2 3
         *.*
         ..*
         """, grid.toString());
   }
}
