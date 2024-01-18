public class ShapeFactory {
    public static Shape getDraw(ShapeEnum forme){
  switch (forme){
      case TRIANGOLO -> { return new Triangolo();
      }
      case RETTANGOLO -> { return new Rettangolo();
      }
        }
        return null;
    }
}
