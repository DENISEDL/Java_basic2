//Scrivere una funzione che controlli se un carattere è un numero, altrimenti lanciare una eccezione.

public class Main {
    public static void main(String[] args) {
        controllaCarattere();

    }
    public static void controllaCarattere(){
        char num = 'f';
        if(num != 1){
            throw new ArithmeticException();
        }
        else {
            System.out.println("Il carattere è un numero");
        }
    }
}