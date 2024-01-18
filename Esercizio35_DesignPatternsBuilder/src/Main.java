//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video



public class Main {
    public static void main(String[] args) {
        PersonBuilder studente = new PersonBuilder();
        studente.setNome("Denise");
        studente.setCognome("De Leo");
        Person io = studente.builder();
        Person studente1 = new Person("Luca","Gallo","JAVA",23);


        System.out.println("Studente " + io);
        System.out.println("Studente " + studente1);
    }
}