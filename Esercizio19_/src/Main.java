//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> listaAnimali = getHashSet();
        Set<String> registroAnimali = getHashSet();
        System.out.println("Elementi presenti nel registroAnimali : " + registroAnimali);
        System.out.println("Elemeenti presenti nella lista animali " + getHashSet());
        eliminaEverificaElementi(listaAnimali,registroAnimali);

    }



    public static Set<String> getHashSet(){
        Set<String> listaAnimali = new HashSet<>();
        listaAnimali.add("cane");
        listaAnimali.add("gatto");
        listaAnimali.add("gallina");
        listaAnimali.add("topo");
        return listaAnimali;
    }

    public static void eliminaEverificaElementi(Set <String> listaAnimali,Set<String> registroAnimali){
        for (int i = 0; i < registroAnimali.size(); i++) {
            if(registroAnimali.equals(listaAnimali)){
                listaAnimali.clear();
                System.out.println(listaAnimali);


            }

        }

    }

}
