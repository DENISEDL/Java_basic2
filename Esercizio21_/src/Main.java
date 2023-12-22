//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato


import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args){


    Studente studente1 = new Studente("Denise",28);
    Studente studente2 = new Studente("Marc",23);
    Studente studente3 = new Studente("Roberto",19);
    Studente studente4 = new Studente("Riccardo",29);
    Studente studente5 = new Studente("Federico",25);
    Studente studente6 = new Studente("Antonino",22);
    Studente studente7 = new Studente("Domenico",24);
    Studente studente8 = new Studente("Luigi",28);
    Studente studente9 = new Studente("Chiara",27);
    Studente studente10 = new Studente("Stefano",30);
    Studente studente11 = new Studente("Ivan",32);
    Studente studente12= new Studente("Carmela",28);

    List<Studente> listaStudentiJava = new ArrayList<Studente>(asList(studente1,studente2,studente3,studente4,studente5,studente6,studente7,studente8,studente9,studente10,studente11,studente12));
    System.out.print("La lista degli studenti java 2023:");
    System.out.println(listaStudentiJava);
    listaStudentiJava.sort(Comparator.comparing(Studente :: getNome));
    System.out.println("La lista ordinata per ordine alfabetico: " + listaStudentiJava);



}
}