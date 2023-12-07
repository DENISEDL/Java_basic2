//Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
//
//Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi sul
// risultato del confronto.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.


public class Main {
    public static void main(String[] args) {

        String settimanaLunga = "Full time";
        String settimanaCorta = "Part time";
        comparaStringhe(settimanaLunga,settimanaCorta);

    }

     // Spero di aver capito bene la traccia;
    public static void comparaStringhe( String settimanaLunga,  String settimanaCorta) {
        StringBuilder indeterminato = new StringBuilder("Le due stringhe sono uguali");
        StringBuilder determinato = new StringBuilder("Le due stringhe sono differenti");
        if (settimanaLunga.equals(settimanaCorta)) {
            System.out.println(indeterminato);
        }
        else {
            System.out.println(determinato);
        }

    }
}


