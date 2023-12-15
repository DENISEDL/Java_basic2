//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.



public class Main {
    public static void main(String[] args) {

        controlloValoreInt(null, null);

    }

    public static void controlloValoreInt(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        try {
            if(stringBuilder == null){
                System.out.printf("chi vince?FEDE?");
            }


        }catch (NullPointerException e) {
            System.out.println("vince il proff ");
        }


    }
}