//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Denise", 20);
        Studente studente2 = new Studente("Calogera", 22);
        Studente studente3 = new Studente("Pippa", 25);

        List<Studente> listaStudenti = new ArrayList<Studente>(Arrays.asList(studente1, studente2, studente3));
        System.out.println("Lista di partenza degli studenti: " + listaStudenti);

        listaStudenti.add(new Studente("Luca", 30));
        listaStudenti.add(new Studente("Laura", 27));
        listaStudenti.add(new Studente("Leonardo", 20));
        listaStudenti.add(new Studente("Paolo", 31));
        System.out.println("Lista aggiornata degli studenti:" + listaStudenti);


        }
    }
