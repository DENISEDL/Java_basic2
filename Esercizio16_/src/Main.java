// Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//Scrivere una funzione che accetti in input 1 char lo stampi
//Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//Scrivere una funzione che accetti in input 1 Character lo stampi
//Scrivere un un valore primitivo per int, double e char e fare autoboxing
//Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//Usare le funzioni scritte con i valori creati






public class Main {
    public static void main(String[] args) {
        sommaInt(2,4);
        stampaChar('h');
        stampaSommaInteger(10,20);
        stampaCharacter('k');
        //Scrivere un un valore primitivo per int, double e char e fare autoboxing
        int eta = 28;
        double conto = 0.0;
        char simboolo = 'D';
        Integer autoboxEta = eta;
        Character autoboxSimolo = simboolo;
        Double autoboxConto = conto;
        //Scrivere un oggetto per Integer, Double e Character e fare Unboxing
        int unboxEta = autoboxEta;
        double unboxConto = autoboxConto;
        char unboxSimboolo = autoboxSimolo;


    }

    // Scrivere una funzione che accetti in input 2 int e ne stampi la somma
    public static void sommaInt(int num1,int num2){
        System.out.println(num1+num2);
    }
    //Scrivere una funzione che accetti in input 1 char lo stampi
    public static void stampaChar(char carattere){
        System.out.println(carattere);
    }
    //Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
    public static void stampaSommaInteger(Integer num1,Integer num2){
        System.out.println(num1+num2);
    }

    //Scrivere una funzione che accetti in input 1 Character lo stampi
    public static void stampaCharacter(Character carattere){
        System.out.println(carattere);
    }

}