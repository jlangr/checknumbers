package marsrover;

public class Rover {
   private Point obstacle;
   private Point point;
   private Direction direction;
   private int size;

   public Rover(Point point, Direction facing) {
      this.point = point;
      this.direction = facing;
   }

   public void execute(char[] commands) {
      for (var command : commands)
         switch (command) {
            case 'f' -> {
               var newPoint = direction.moveForwardFrom(point);
               if (!isBlocked(newPoint))
                  moveTo(newPoint);
            }
            case 'b' -> {
               var newPoint = direction.moveBackwardFrom(point);
               if (!isBlocked(newPoint))
                  moveTo(newPoint);
            }
            case 'r' -> direction = direction.turnRight();
            case 'l' -> direction = direction.turnLeft();
         }
   }

   private void moveTo(Point newPoint) {
      if (isXOutOfBounds(newPoint))
         point = wrapXOfPoint();
      else if (wrapYOfPoint(newPoint))
         point = getPoint();
      else
         point = newPoint;
   }

   private Point getPoint() {
      return new Point(point.x(), point.y() * -1);
   }

   private Point wrapXOfPoint() {
      return new Point(point.x() * -1, point.y());
   }

   private boolean wrapYOfPoint(Point point) {
      return size > 0 && Math.abs(point.y()) >= size;
   }

   private boolean isXOutOfBounds(Point point) {
      return size > 0 && Math.abs(point.x()) >= size;
   }

   private boolean isBlocked(Point point) {
      return point.equals(obstacle);
   }

   public void execute(String commands) {
      this.execute(commands.toCharArray());
   }

   public Point point() {
      return point;
   }

   public Direction direction() {
      return direction;
   }

   public void setDirection(Direction direction) {
      this.direction = direction;
   }

   public void addObstacle(int x, int y) {
      this.obstacle = new Point(x, y);
   }

   public void setSize(int size) {
      this.size = size;
   }
}
