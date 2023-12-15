//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Set<String> lista1 = getHashSet();
        System.out.println("Stampa Hashset riempito" + lista1 + ", Stampa grandezza : " + lista1.size());

    }
    public static Set<String> getHashSet(){
        Set<String> lista = new HashSet<>();
        lista.add("elemento1");
        lista.add("elemento2");
        lista.add("elemento3");
        lista.add("elemento4");
        return lista;
    }


}