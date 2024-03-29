//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String stampaLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        // 1 march 2002
        System.out.println("Stampa per intero : " + stampaLong);
        String stampaMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        //1 mar 2002
        System.out.println("Stampa il mese abbreviato : " + stampaMedium);
        String stampaShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        // 01/03/2002
        System.out.println("Stampa abbreviato : " + stampaShort);

    }
}