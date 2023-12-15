//Scrivere una funzione che restituisca un HashSet riempito
//Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//Verificare che l' elemento sia parte del Set e stampare il risultato


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<String> registro = getHashSet();
        System.out.println("L'elemento fa parte del Set? : " + registro.contains("Nome"));

    }
    public static Set<String> getHashSet(){
        Set<String> registro1 = new HashSet<>();
        registro1.add("Nome");
        registro1.add("Cognome");
        registro1.add("Codice");
        registro1.add("E-mail");
        return registro1;
    }

}
