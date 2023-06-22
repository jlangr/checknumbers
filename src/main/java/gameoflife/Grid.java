package gameoflife;

import java.io.BufferedReader;
import java.io.IOException;

public class Grid {
   public static final char ALIVE_MARKER = '*';
   public static final char DEAD_MARKER = '.';
   private Boolean[][] cells;

   public void loadFrom(BufferedReader reader) throws IOException {
      var dimensions = Dimensions.parseFrom(reader.readLine());

      cells = new Boolean[dimensions.rows()][dimensions.cols()];

      String line;
      for (var row = 0; (line = reader.readLine()) != null; row++) {
         cells[row] = parse(line);
      }
   }

   public void loadFrom(Boolean[][] cells) {
      this.cells = cells;
   }

   @Override
   public String toString() {
      var grid = new StringBuilder();

      grid.append(String.format("%d %d%n", rows(), cols()));

      for (var row = 0; row < rows(); row++) {
         for (var col = 0; col < cols(); col++)
            grid.append(cells[row][col] ? ALIVE_MARKER : DEAD_MARKER);
         grid.append('\n');
      }
      return grid.toString();
   }

   private int cols() {
      return cells[0].length;
   }

   private int rows() {
      return cells.length;
   }

   Boolean[] parse(String line) {
      return line.chars()
         .mapToObj(c -> c == '*')
         .toArray(Boolean[]::new);
   }

   public boolean isAlive(int row, int col) {
      return cells[col][row];
   }
}
