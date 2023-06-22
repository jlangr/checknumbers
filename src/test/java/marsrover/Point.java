package marsrover;

public record Point(int x, int y) {
   public Point moveY(int n) {
      return new Point(x, y + n);
   }

   public Point moveX(int n) {
      return new Point(x + n, y);
   }
}
