public class Main {
    public static void main(String[] args) {
        Punto coordinateLongitudinali = new Punto(10,16);
        Punto coordinateLatitudinali = new Punto(67,72);


        System.out.println("Le coorinate Longitudinali : " + coordinateLongitudinali);
        System.out.println("Punto x Longitudinale: " + coordinateLatitudinali.x());
        System.out.println("Punto y Longitudinale: " + coordinateLatitudinali.y());
        System.out.println("Le coorinate Latitudinali : " + coordinateLatitudinali);
        System.out.println("Punto x Latitudinali: " + coordinateLatitudinali.x());
        System.out.println("Punto y Latitudinali: " + coordinateLatitudinali.y());

        boolean sonoUguali = coordinateLatitudinali.equals(coordinateLongitudinali);
        System.out.println("Le coordinate Latitudinali e Longitudinali sono uguali? : " + sonoUguali);
    }
}