//Scrivere una funzione che controlli se un numero int è in un determinato range.
// Se lo, è ritorna true ; se non lo è, lancia un'eccezione.

public class Main {
    public static void main(String[] args) {

        controlloIntinUnDetermiantoRange(1,2,2);
    }

    public static void controlloIntinUnDetermiantoRange(int num1,int num2,int numVerifica){

            if (numVerifica < num1 || numVerifica > num2 || num1 > num2) {
                throw new ArithmeticException();

        }else {
            System.out.println("True" );
        }
    }

}