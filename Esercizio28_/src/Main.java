//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String anno = String.valueOf(data.getYear());
        System.out.println("L'anno : " + anno);
        // 2023
        String mese = String.valueOf(data.getMonth());
        System.out.println("Il mese : " + mese);
        //MARCH
        String giorno = String.valueOf(data.getDayOfMonth());
        System.out.println("Il giorno : " + giorno);
        //1
        String giornoSettimana = String.valueOf(data.getDayOfWeek());
        System.out.println("Il giorno della settimana : " + giornoSettimana);
        //WEDNESDAY
    }
}