//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> frutta = new LinkedList<Fruit>();
        frutta.add(new Fruit("mele"));
        frutta.add(new Fruit("pere"));
        frutta.add(new Fruit("fragole"));
        frutta.add(new Fruit("kiwi"));
        frutta.add(new Fruit("melograni"));
        frutta.add(new Fruit("clementine"));
        System.out.println(frutta);
        frutta.addFirst(new Fruit("banana"));
        frutta.addLast(new Fruit("uva"));
        System.out.println(frutta);
    }
}