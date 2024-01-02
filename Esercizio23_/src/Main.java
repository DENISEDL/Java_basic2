//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.


import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> capStudenti = new HashMap<>();
        capStudenti.put("CS",87100);
        capStudenti.put("RC",89121);
        capStudenti.put("NA",80013);
        capStudenti.put("MI",20019);
        System.out.println("Cap postale degli Studenti : " + capStudenti);


        Map<String,Integer> studenti = Map.of("Denise",28,
                "Marc",23,"Luigi",30,"Paolo",22);
        System.out.println("Studenti : " + studenti);


        Map<String,String> scuole =  Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Liceo","Scientifico"),
                new AbstractMap.SimpleEntry<>("Professionale","Odontotecnico"),
                new AbstractMap.SimpleEntry<>("Industriale","Meccanico")
        );
        System.out.println("Scuole : " + scuole);





    }
}