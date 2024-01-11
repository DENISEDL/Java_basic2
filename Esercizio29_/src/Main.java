//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataAggiornata = data.plusYears(1).minusMonths(1).plusDays(7);
        System.out.println("Data aggiornata: " + dataAggiornata);
        //2024-02-08T13:00Z
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ITALY);
        String formattedDate = data.format(formatter);
        System.out.println("Data localizzata per Italia : " + formattedDate);
        // 2023-03-01 13:00:00


    }
}