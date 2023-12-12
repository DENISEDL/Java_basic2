//Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0 e
// gestista sia l'eccezione della divisione che quella di indice non presente nell'array,
// leggendone il messaggio. Eseguire sempre un
// blocco di codice scrivendo un messaggio in console.


public class Main {
    public static void main(String[] args) {
       int[] numeri={1,4,7,10,11,50};
       provaDivisionePerZero(numeri);
    }

    public static void provaDivisionePerZero(int[] numeri) {
        try {
            if (numeri.length == numeri[4] / 0)
                throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Indice dell'array non può essere diviso per 0 :" + e);
        } catch (Exception e ){
            System.out.println("Non è presente questo indice nell'array : " + e);
        }
    }

}