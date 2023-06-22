package marsrover;

public enum Direction {
   NORTH {
      @Override
      Point moveForwardFrom(Point point, int distance) {
         return point.moveY(distance);
      }
   },
   EAST {
      @Override
      Point moveForwardFrom(Point point, int distance) {
         return point.moveX(distance);
      }
   },
   SOUTH {
      @Override
      Point moveForwardFrom(Point point, int distance) {
         return point.moveY(-distance);
      }
   },
   WEST {
      @Override
      Point moveForwardFrom(Point point, int distance) {
         return point.moveX(-distance);
      }
   };

   abstract Point moveForwardFrom(Point point, int distance);

   public Point moveForwardFrom(Point point) {
      return moveForwardFrom(point, 1);
   }

   public Point moveBackwardFrom(Point point) {
      return moveForwardFrom(point, -1);
   }

   public Direction turnRight() {
      return Direction.values()[incrementOrdinal()];
   }

   public Direction turnLeft() {
      return Direction.values()[decrementOrdinal()];
   }

   private int incrementOrdinal() {
      var newOrdinal = this.ordinal() + 1;
      if (newOrdinal > Direction.values().length)
         newOrdinal = 0;
      return newOrdinal;
   }

   private int decrementOrdinal() {
      var newOrdinal = this.ordinal() - 1;
      if (newOrdinal < 0)
         newOrdinal = Direction.values().length - 1;
      return newOrdinal;
   }
}
