//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.



public class Main {
    public static void main(String[] args) {

        controlloValoreInt(-1, -1);

    }

    public static void controlloValoreInt(int numeratore, int denominatore) {
        try {
            if (numeratore == -1) {
                throw new ArithmeticException();
            } else {
                System.out.println("Il numeratore ha un valore");
            }

        } catch (ArithmeticException e) {
            System.out.println("Manca il valore al numeratore : " + e);
        }
        try {
            if (denominatore == -1) {
                throw new ArithmeticException();
            } else {
                System.out.println("Il denominatore ha un valore");
            }

        } catch (ArithmeticException e) {
            System.out.println("Manca il valore al denominatore : " + e);
        }

    }
}