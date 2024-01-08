//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia


import java.time.OffsetDateTime;



public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataAggiornata = data.plusYears(1).minusMonths(1).plusDays(7);
        System.out.println("Data aggiornata: " + dataAggiornata);
    }
}