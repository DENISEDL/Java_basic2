public class ShapeFactory {
    public static Shape tipoDiForme(ShapeEnum forme){
  switch (forme){
      case TRIANGOLO -> { return new Triangolo();
      }
      case RETTANGOLO -> { return new Rettangolo();
      }

        }
        return null;
    }
}
