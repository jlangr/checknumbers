package gameoflife;

record Dimensions(int rows, int cols) {
   static Dimensions parseFrom(String dimensionsInput) {
      var rowsByColumns = dimensionsInput.trim().split(" ");
      var rows = Integer.parseInt(rowsByColumns[0]);
      var cols = Integer.parseInt(rowsByColumns[1]);
      return new Dimensions(rows, cols);
   }
}
