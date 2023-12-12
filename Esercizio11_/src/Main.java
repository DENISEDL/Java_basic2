//Scrivere una funzione che controlli se un numero int è in un determinato range.
// Se lo, è ritorna true ; se non lo è, lancia un'eccezione.

public class Main {
    public static void main(String[] args) {

        controlloIntinUnDetermiantoRange();

    }

    public static void controlloIntinUnDetermiantoRange(){
        int num1= 1;
        int num2= 3;
        int numVerifica = 4;
            if (numVerifica < num1 || numVerifica > num2 || num1 > num2) {
                throw new ArithmeticException();

        }else {
            System.out.println("True" );
        }
    }

}