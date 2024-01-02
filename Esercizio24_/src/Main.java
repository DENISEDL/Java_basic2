//Creare un hashmap, prendere tutti i valori, ordinarli e stamparli


import java.util.*;


public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> etaCuccioliCane = new HashMap<>();
        etaCuccioliCane.put("Bobby",2);
        etaCuccioliCane.put("Pepita",6);
        etaCuccioliCane.put("Tokyo",5);
        etaCuccioliCane.put("Kira",9);

        Collection<Integer> value = etaCuccioliCane.values();
        List<Integer> listaValueOrdinata = new ArrayList<>(value);
        Collections.sort(listaValueOrdinata);
        System.out.println("Oridine di anni dei cuccioli presenti nel canile : " + listaValueOrdinata);

    }
}